package shop.ferrerimha.intensivo_spring.code.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.ferrerimha.intensivo_spring.code.dto.DtoGameList;
import shop.ferrerimha.intensivo_spring.code.dto.DtoListProjection;
import shop.ferrerimha.intensivo_spring.code.entities.GameList;
import shop.ferrerimha.intensivo_spring.code.projections.GameListProjection;
import shop.ferrerimha.intensivo_spring.code.projections.GameMinProjection;
import shop.ferrerimha.intensivo_spring.code.repositories.GameListRepository;
import shop.ferrerimha.intensivo_spring.code.repositories.GameRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<DtoGameList> findAllGameLists(){
        List<GameList> gamesLists = repository.findAll();
        List<DtoGameList> resultAllGameLists = gamesLists
                                            .stream()
                                            .map(gameLists -> new DtoGameList(gameLists))
                                            .toList();
        return resultAllGameLists;
    }

    public void moveGame(Long listId, int sourceIndex, int DestinationIndex){
        List<GameMinProjection> list = gameRepository.findByGameList(listId);
        GameMinProjection game = list.remove(sourceIndex);
        list.add(DestinationIndex, game);
        int source = sourceIndex < DestinationIndex ? sourceIndex : DestinationIndex;
        int destination = sourceIndex < DestinationIndex ? DestinationIndex : sourceIndex;

        for (int i = source; i <= destination; i++){
            repository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }

    public List<DtoListProjection> returnNewGameList(){
        List<GameListProjection> gameList = repository.returnNewGameList();
        List<DtoListProjection> newGameList = gameList.stream() 
                                                      .map(game -> new DtoListProjection(game))
                                                      .toList();
        return newGameList;                                       
    }

}
