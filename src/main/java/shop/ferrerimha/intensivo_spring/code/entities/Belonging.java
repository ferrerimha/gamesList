package shop.ferrerimha.intensivo_spring.code.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_belonging")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Belonging {
    
    @EmbeddedId
    private BelongingPK belongingPK = new BelongingPK();
    private Integer position;

    public Belonging(Game game, GameList gameList, Integer position) {
        belongingPK.setGame(game);
        belongingPK.setGameList(gameList);
        this.position = position;
    }

}
