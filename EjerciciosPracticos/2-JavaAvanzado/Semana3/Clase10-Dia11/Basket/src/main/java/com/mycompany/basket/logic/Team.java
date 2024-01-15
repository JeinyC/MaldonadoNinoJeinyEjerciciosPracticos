package com.mycompany.basket.logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author jeiny
 */


@Entity
public class Team implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Game> games;

    public Team(String name) {
        this.name = name;
        this.games = new ArrayList<>();
    }

    public Team() {
    }

    public Team(int id, String name, List<Game> games) {
        this.id = id;
        this.name = name;
        this.games = games;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "Team{" + "id=" + id + ", name=" + name + ", games=" + games + '}';
    }
}
