package ru.vaganov.FootbalCatalog.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.vaganov.FootbalCatalog.models.Player;
import ru.vaganov.FootbalCatalog.models.Team;
import ru.vaganov.FootbalCatalog.repositories.PlayerRepository;
import ru.vaganov.FootbalCatalog.repositories.TeamRepository;

@Service
public class PlayerService {
    private PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository repo){
        playerRepository = repo;
    }

    public void saveTeam(Player player){
        playerRepository.save(player);
    }

    public Player findById(Long id){
        return playerRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Team not found with id: " + id));
    }

}

