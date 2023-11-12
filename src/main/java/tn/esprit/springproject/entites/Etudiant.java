package tn.esprit.springproject.entites;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;

    private String nomEt;

    private String prenomEt;

    private long cin;

    private String ecole;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiantList")
    private List<Reservation> reservationList;

}
