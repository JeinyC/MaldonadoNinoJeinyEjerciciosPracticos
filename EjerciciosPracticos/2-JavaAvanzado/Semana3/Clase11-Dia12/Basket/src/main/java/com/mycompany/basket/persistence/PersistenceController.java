package com.mycompany.basket.persistence;

import com.mycompany.basket.logic.Game;
import com.mycompany.basket.logic.Team;
import java.util.List;


/**
 *
 * @author jeiny
 */
public class PersistenceController {
    
    GameJpaController gameControllerJPA = new GameJpaController();
    TeamJpaController teamControllerJPA = new TeamJpaController();
    
    public void addTeam(Team team){
        teamControllerJPA.create(team);      
    }
     
    public List<Team>  getTeamEntitiesList(){
         return teamControllerJPA.findTeamEntities();
    }
     
     
    public void addGame(Game game){
        gameControllerJPA.create(game);
    }
    
    public List<Game> getGameEntitiesList(){
        return gameControllerJPA.findGameEntities();
    }

}
