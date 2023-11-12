package tn.esprit.springproject.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;

    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private typeChambre typeC;
    @OneToMany
    private Set<Reservation> reservation;

    @ManyToOne
    @JsonIgnore
    private Bloc bloc;
}
