package shop.ferrerimha.intensivo_spring.code.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.ferrerimha.intensivo_spring.code.dto.DtoGameList;
import shop.ferrerimha.intensivo_spring.code.entities.GameList;
import shop.ferrerimha.intensivo_spring.code.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    @Transactional(readOnly = true)
    public List<DtoGameList> findAllGameLists(){
        List<GameList> gamesLists = repository.findAll();
        List<DtoGameList> resultAllGameLists = gamesLists
                                            .stream()
                                            .map(gameLists -> new DtoGameList(gameLists))
                                            .toList();
        return resultAllGameLists;
    }
}
