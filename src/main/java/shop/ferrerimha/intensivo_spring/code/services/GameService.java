package shop.ferrerimha.intensivo_spring.code.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.ferrerimha.intensivo_spring.code.dto.DtoGame;
import shop.ferrerimha.intensivo_spring.code.entities.Game;
import shop.ferrerimha.intensivo_spring.code.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<DtoGame> findAllGames(){
        List<Game> games = repository.findAll();
        List<DtoGame> resultAllGames = games.stream()
                                            .map(game -> new DtoGame(game))
                                            .toList();
        return resultAllGames;
    }
}
