package tn.esprit.springproject.entites;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE) //(remplace private de chaque attributs, tous aattributs ajouté sera private)
public class Reservation  implements Serializable {
    @Id
     String idReservation;
    @Temporal(TemporalType.DATE)
     Date anneeUniversitaire;

     boolean estValide;
    @ManyToMany
     List<Etudiant> etudiantList;


}
