package shop.ferrerimha.intensivo_spring.code.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.ferrerimha.intensivo_spring.code.dto.DtoGame;
import shop.ferrerimha.intensivo_spring.code.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/api")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping("/games")
    public List<DtoGame> findGames() {
        List<DtoGame> games = service.findAllGames();
        return games;
    }
    
}
