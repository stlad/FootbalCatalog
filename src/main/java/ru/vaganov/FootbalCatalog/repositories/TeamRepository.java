package ru.vaganov.FootbalCatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ru.vaganov.FootbalCatalog.models.Country;
import ru.vaganov.FootbalCatalog.models.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByName(String name);
}
