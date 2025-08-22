package shop.ferrerimha.intensivo_spring.code.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shop.ferrerimha.intensivo_spring.code.dto.DtoGame;
import shop.ferrerimha.intensivo_spring.code.dto.DtoGameMin;
import shop.ferrerimha.intensivo_spring.code.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/api")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping(value = "/games")
    public List<DtoGameMin> findGames() {
        List<DtoGameMin> games = service.findAllGames();
        return games;
    }

    @GetMapping(value = "/games/{id}")
    public DtoGame findGameById(@PathVariable Long id){
        DtoGame game = service.findGameById(id);
        return game;
    }
    
}
