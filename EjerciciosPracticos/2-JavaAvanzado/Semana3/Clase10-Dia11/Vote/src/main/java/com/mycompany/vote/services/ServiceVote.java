/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vote.services;

import com.mycompany.vote.logic.Team;
import com.mycompany.vote.persistence.PersistenceController;
import java.util.List;

/**
 *
 * @author jeiny
 */
public class ServiceVote {

    PersistenceController persistenceController = new PersistenceController();

    public ServiceVote() {
    }

    public void addTeam(Team team) throws Exception {
        persistenceController.addTeam(team);
    }

    public void updateTeam(Team team) {
        persistenceController.updateTeam(team);
    }

    public Team getTeam(int id) {
        return persistenceController.teamById(id);
    }
    
    public List<Team> teamList(){
        return persistenceController.getTeams();
    }
}
