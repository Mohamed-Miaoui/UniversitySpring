package tn.esprit.springproject.entites;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;

    private String nomBloc;

    private long capaciteBloc;
    @ManyToOne
    private Foyer foyer;
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambreList;
}
