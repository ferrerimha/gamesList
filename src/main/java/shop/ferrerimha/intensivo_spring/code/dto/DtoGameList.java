package shop.ferrerimha.intensivo_spring.code.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import shop.ferrerimha.intensivo_spring.code.entities.GameList;

@Getter
@NoArgsConstructor
public class DtoGameList {

    private Long id;
    private String name;

    public DtoGameList(GameList gameList){
        id = gameList.getId();
        name = gameList.getName();
    }
}
