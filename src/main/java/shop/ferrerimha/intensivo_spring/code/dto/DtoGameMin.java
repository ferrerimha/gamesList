package shop.ferrerimha.intensivo_spring.code.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.ferrerimha.intensivo_spring.code.entities.Game;

@NoArgsConstructor
@Getter
@Setter
public class DtoGameMin {

    private long id;
    private String title;
    private int year;
    private String genre;
    private String shortDescription;

    public DtoGameMin(Game game){
        this.id = game.getId();
        this.title = game.getTitle();
        this.genre = game.getGenre();
        this.year = game.getYear();
        this.shortDescription = game.getShortDescription();
    }
    
}
