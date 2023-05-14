package ru.vaganov.FootbalCatalog.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.vaganov.FootbalCatalog.models.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
