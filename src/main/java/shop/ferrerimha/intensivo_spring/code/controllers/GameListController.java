package shop.ferrerimha.intensivo_spring.code.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.ferrerimha.intensivo_spring.code.dto.DtoGameList;
import shop.ferrerimha.intensivo_spring.code.dto.DtoGameMin;
import shop.ferrerimha.intensivo_spring.code.dto.DtoListProjection;
import shop.ferrerimha.intensivo_spring.code.dto.DtoModifyGameList;
import shop.ferrerimha.intensivo_spring.code.services.GameListService;
import shop.ferrerimha.intensivo_spring.code.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/api")
public class GameListController {

    @Autowired
    private GameListService service;
    @Autowired
    private GameService gameService;
    

    @GetMapping(value = "/gamelist")
    public List<DtoGameList> findGames() {
        List<DtoGameList> games = service.findAllGameLists();
        return games;
    }

    @GetMapping("/{id}/games")
    public List<DtoGameMin> findAllGamesList(@PathVariable Long id){
        List<DtoGameMin> result = gameService.findAllGamesList(id);
        return result;
    }

    @PutMapping("lists/modify")
    public ResponseEntity modifyGameList(@RequestBody DtoModifyGameList entity) {
        service.moveGame(entity.getId(),
                         entity.getSourceIndex(),
                         entity.getDestinationIndex());
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    
    @GetMapping("/lists")
    public List<DtoListProjection> getMethodName() {
        return service.returnNewGameList();
    }
    
    
}
