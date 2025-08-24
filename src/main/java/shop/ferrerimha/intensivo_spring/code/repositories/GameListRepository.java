package shop.ferrerimha.intensivo_spring.code.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import shop.ferrerimha.intensivo_spring.code.entities.GameList;
import shop.ferrerimha.intensivo_spring.code.projections.GameListProjection;
public interface GameListRepository extends JpaRepository<GameList, Long> {
    
    @Modifying
    @Transactional
    @Query(nativeQuery = true, 
    value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, int newPosition);


    @Query(nativeQuery = true, value = """
            SELECT TB_BELONGING .*, TB_GAME.TITLE, TB_BELONGING.LIST_ID 
            FROM TB_BELONGING INNER JOIN TB_GAME ON TB_GAME.ID = TB_BELONGING.GAME_ID 
            ORDER BY TB_BELONGING.LIST_ID, POSITION
        """)
    List<GameListProjection> returnNewGameList();

}
