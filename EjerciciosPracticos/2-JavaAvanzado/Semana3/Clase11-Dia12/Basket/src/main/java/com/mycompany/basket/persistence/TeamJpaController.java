package com.mycompany.basket.persistence;

import com.mycompany.basket.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.basket.logic.Game;
import com.mycompany.basket.logic.Team;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jeiny
 */
public class TeamJpaController implements Serializable {

    public TeamJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public TeamJpaController() {
        emf = Persistence.createEntityManagerFactory("basketUnit");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Team team) {
        if (team.getGames() == null) {
            team.setGames(new ArrayList<Game>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Game> attachedGames = new ArrayList<Game>();
            for (Game gamesGameToAttach : team.getGames()) {
                gamesGameToAttach = em.getReference(gamesGameToAttach.getClass(), gamesGameToAttach.getId());
                attachedGames.add(gamesGameToAttach);
            }
            team.setGames(attachedGames);
            em.persist(team);
            for (Game gamesGame : team.getGames()) {
                Team oldTeamOfGamesGame = gamesGame.getTeam();
                gamesGame.setTeam(team);
                gamesGame = em.merge(gamesGame);
                if (oldTeamOfGamesGame != null) {
                    oldTeamOfGamesGame.getGames().remove(gamesGame);
                    oldTeamOfGamesGame = em.merge(oldTeamOfGamesGame);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Team team) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Team persistentTeam = em.find(Team.class, team.getId());
            List<Game> gamesOld = persistentTeam.getGames();
            List<Game> gamesNew = team.getGames();
            List<Game> attachedGamesNew = new ArrayList<Game>();
            for (Game gamesNewGameToAttach : gamesNew) {
                gamesNewGameToAttach = em.getReference(gamesNewGameToAttach.getClass(), gamesNewGameToAttach.getId());
                attachedGamesNew.add(gamesNewGameToAttach);
            }
            gamesNew = attachedGamesNew;
            team.setGames(gamesNew);
            team = em.merge(team);
            for (Game gamesOldGame : gamesOld) {
                if (!gamesNew.contains(gamesOldGame)) {
                    gamesOldGame.setTeam(null);
                    gamesOldGame = em.merge(gamesOldGame);
                }
            }
            for (Game gamesNewGame : gamesNew) {
                if (!gamesOld.contains(gamesNewGame)) {
                    Team oldTeamOfGamesNewGame = gamesNewGame.getTeam();
                    gamesNewGame.setTeam(team);
                    gamesNewGame = em.merge(gamesNewGame);
                    if (oldTeamOfGamesNewGame != null && !oldTeamOfGamesNewGame.equals(team)) {
                        oldTeamOfGamesNewGame.getGames().remove(gamesNewGame);
                        oldTeamOfGamesNewGame = em.merge(oldTeamOfGamesNewGame);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = team.getId();
                if (findTeam(id) == null) {
                    throw new NonexistentEntityException("The team with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Team team;
            try {
                team = em.getReference(Team.class, id);
                team.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The team with id " + id + " no longer exists.", enfe);
            }
            List<Game> games = team.getGames();
            for (Game gamesGame : games) {
                gamesGame.setTeam(null);
                gamesGame = em.merge(gamesGame);
            }
            em.remove(team);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Team> findTeamEntities() {
        return findTeamEntities(true, -1, -1);
    }

    public List<Team> findTeamEntities(int maxResults, int firstResult) {
        return findTeamEntities(false, maxResults, firstResult);
    }

    private List<Team> findTeamEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Team.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Team findTeam(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Team.class, id);
        } finally {
            em.close();
        }
    }

    public int getTeamCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Team> rt = cq.from(Team.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
