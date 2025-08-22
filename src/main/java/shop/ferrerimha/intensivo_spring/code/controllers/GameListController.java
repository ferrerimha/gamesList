package shop.ferrerimha.intensivo_spring.code.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.ferrerimha.intensivo_spring.code.dto.DtoGameList;
import shop.ferrerimha.intensivo_spring.code.services.GameListService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/api")
public class GameListController {

    @Autowired
    private GameListService service;

    @GetMapping(value = "/gamelist")
    public List<DtoGameList> findGames() {
        List<DtoGameList> games = service.findAllGameLists();
        return games;
    }
}
