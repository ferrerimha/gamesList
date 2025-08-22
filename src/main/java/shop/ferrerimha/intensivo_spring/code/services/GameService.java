package shop.ferrerimha.intensivo_spring.code.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shop.ferrerimha.intensivo_spring.code.dto.DtoGame;
import shop.ferrerimha.intensivo_spring.code.dto.DtoGameMin;
import shop.ferrerimha.intensivo_spring.code.entities.Game;
import shop.ferrerimha.intensivo_spring.code.projections.GameMinProjection;
import shop.ferrerimha.intensivo_spring.code.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<DtoGameMin> findAllGames(){
        List<Game> games = repository.findAll();
        List<DtoGameMin> resultAllGames = games.stream()
                                            .map(game -> new DtoGameMin(game))
                                            .toList();
        return resultAllGames;
    }

    @Transactional(readOnly = true)
    public DtoGame findGameById(Long id){
        Game game = repository.findById(id).orElseThrow();
        DtoGame dtoGame = new DtoGame(game);
        return  dtoGame;
    }

    @Transactional(readOnly = true)
    public List<DtoGameMin> findAllGamesList(Long listId){
        List<GameMinProjection> result = repository.findByGameList(listId);
        List<DtoGameMin> resultAllGames = result.stream()
                                            .map(game -> new DtoGameMin(game))
                                            .toList();
        return resultAllGames;
    }
}
