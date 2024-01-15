package com.mycompany.vote.logic;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jeiny
 */

@Entity
@Table(name = "team")
public class Team implements Serializable{
    
    @Id
    int id;
    @Column(name = "vote")
    int vote;

    public Team(int id, int vote) {
        this.id = id;
        this.vote = vote;
    }

    public Team() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote += vote;
    }
}