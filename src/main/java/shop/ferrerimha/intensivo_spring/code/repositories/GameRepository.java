package shop.ferrerimha.intensivo_spring.code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ferrerimha.intensivo_spring.code.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
