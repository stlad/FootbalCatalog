package ru.vaganov.FootbalCatalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.vaganov.FootbalCatalog.models.Country;
import ru.vaganov.FootbalCatalog.repositories.CountryRepository;

@Service
public class CountryService {
    private CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository repo){
        countryRepository = repo;
    }

    public void saveTeam(Country country){
        countryRepository.save(country);
    }

    public Country findById(Long id){
        return countryRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Country not found with id: " + id));
    }

    public Country findByName(String name){
        Country country = countryRepository.findByName(name) ;

        if(country == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "country not found with name: " + name);
        return country;
    }
}

