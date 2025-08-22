package shop.ferrerimha.intensivo_spring.code.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.ferrerimha.intensivo_spring.code.entities.Game;
import shop.ferrerimha.intensivo_spring.code.projections.GameMinProjection;

@NoArgsConstructor
@Getter
@Setter
public class DtoGameMin {

    private long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public DtoGameMin(Game game){
        this.id = game.getId();
        this.title = game.getTitle();
        this.imgUrl = game.getImg_url();
        this.year = game.getYear();
        this.shortDescription = game.getShortDescription();
    }

    public DtoGameMin(GameMinProjection game){
        this.id = game.getId();
        this.title = game.getTitle();
        this.year = game.getGameYear();
        this.imgUrl = game.getImgUrl();
        this.shortDescription = game.getShortDescription();
    }
    
}
