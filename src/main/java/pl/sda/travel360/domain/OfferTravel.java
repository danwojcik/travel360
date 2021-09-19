package pl.sda.travel360.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class OfferTravel {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String country;
    private LocalDateTime started;
    private LocalDateTime ending;
    private String duration; //czas trwania
    private double cost;

}
