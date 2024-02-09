package com.mycompany.basket.logic;

import com.mycompany.basket.persistence.PersistenceController;
import java.util.List;

/**
 *
 * @author jeiny
 */
public class Controller {
    
    PersistenceController persistenceController = new PersistenceController();

    public Controller() {
    }
 
    public void addTeam(Team team){
        persistenceController.addTeam(team);
    }
    
    public List<Team> getTeamList(){
        return persistenceController.getTeamEntitiesList();
    }
    
    public void addGame(Game game){
        persistenceController.addGame(game);
    }
    
    public List<Game> getGameList(){
        return persistenceController.getGameEntitiesList();
    }
}
