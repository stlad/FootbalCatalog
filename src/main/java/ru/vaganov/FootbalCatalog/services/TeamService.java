package ru.vaganov.FootbalCatalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.vaganov.FootbalCatalog.models.Team;
import ru.vaganov.FootbalCatalog.repositories.TeamRepository;

@Service
public class TeamService {
    private TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository repo){
        teamRepository = repo;
    }

    public void saveTeam(Team team){
        teamRepository.save(team);
    }

    public Team findById(Long id){
        return teamRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Team not found with id: " + id));
    }

    public Team findByName(String name){
        Team team = teamRepository.findByName(name) ;

        if(team == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Team not found with name: " + name);
        return team;
    }
}
