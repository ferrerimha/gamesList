package shop.ferrerimha.intensivo_spring.code.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.ferrerimha.intensivo_spring.code.projections.GameListProjection;

@Getter
@Setter
@NoArgsConstructor
public class DtoListProjection {
    Integer POSITION;
    String TITLE;
    Integer ID;
    Integer GAME_ID;

    public DtoListProjection(GameListProjection projection){
        this.POSITION=projection.getPOSITION();
        this.TITLE=projection.getTITLE();
        this.ID=projection.getLIST_ID();
        this.GAME_ID=projection.getGAME_ID();
    }
}
