package ru.vaganov.FootbalCatalog.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String lastname;
    private String gender;
    private LocalDate birthDate;

    @ManyToMany
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Set<Team> team;

    public Player(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }
}
