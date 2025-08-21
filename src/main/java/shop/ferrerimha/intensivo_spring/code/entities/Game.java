package shop.ferrerimha.intensivo_spring.code.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private Double score; 
    @Column(name = "game_year")
    private int year;
    private String genre;
    private String platforms;
    private String img_url;    
    @Column(name = "short_description", columnDefinition= "TEXT")
    private String shortDescription;
    @Column(name = "long_description", columnDefinition= "TEXT")
    private String longDescription;

}
