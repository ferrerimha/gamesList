package shop.ferrerimha.intensivo_spring.code.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import shop.ferrerimha.intensivo_spring.code.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
