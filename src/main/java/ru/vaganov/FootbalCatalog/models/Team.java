package ru.vaganov.FootbalCatalog.models;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Team {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @JoinColumn(name = "player_id", referencedColumnName = "id")
    private Set<Player> players;

    @OneToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;


    public Team(){}

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public Long getId() {
        return id;
    }
}
