package tn.esprit.springproject.entites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniversite;

    private String nomUniversite;

    private String adresse;
    @OneToOne
    private Foyer foyer;
}
