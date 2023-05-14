package ru.vaganov.FootbalCatalog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Country{

    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
