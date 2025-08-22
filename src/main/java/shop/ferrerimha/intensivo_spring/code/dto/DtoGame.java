package shop.ferrerimha.intensivo_spring.code.dto;
import org.springframework.beans.BeanUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import shop.ferrerimha.intensivo_spring.code.entities.Game;

@Getter
@Setter
@NoArgsConstructor
public class DtoGame {

    private long id;
    private String title;
    private int year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public DtoGame(Game game){
        BeanUtils.copyProperties(game, this);
    }
}
