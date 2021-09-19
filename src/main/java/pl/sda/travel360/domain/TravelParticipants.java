package pl.sda.travel360.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class TravelParticipants {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
