package shop.ferrerimha.intensivo_spring.code.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoModifyGameList {
    private long id;
    private int sourceIndex;
    private int destinationIndex;
}
