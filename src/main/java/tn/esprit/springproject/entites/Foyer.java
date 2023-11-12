package tn.esprit.springproject.entites;

import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer;
    private long capaciteFoyer;
    @OneToOne(mappedBy = "foyer") //mappedby fil fils => fk appears in the other table (patent)
    private Universite universite;
    @OneToMany(mappedBy = "foyer")
    private List<Bloc> blocList;
}
