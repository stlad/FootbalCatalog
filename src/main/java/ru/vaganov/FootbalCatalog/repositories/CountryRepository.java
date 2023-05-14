package ru.vaganov.FootbalCatalog.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.vaganov.FootbalCatalog.models.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

    Country findByName(String name);

}
