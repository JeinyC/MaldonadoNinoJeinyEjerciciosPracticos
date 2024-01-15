/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vote.persistence;

import com.mycompany.vote.exceptions.NonexistentEntityException;
import com.mycompany.vote.logic.Team;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeiny
 */
public class PersistenceController {

    TeamJpaController teamJpa = new TeamJpaController();

    public void addTeam(Team team) throws Exception {
        teamJpa.create(team);
    }

    public void updateTeam(Team team) {
        try {
            teamJpa.edit(team);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Team teamById(int id) {
        return teamJpa.findTeam(id);
    }
    
    public List<Team> getTeams() {
        return teamJpa.findTeamEntities();
    }
}
