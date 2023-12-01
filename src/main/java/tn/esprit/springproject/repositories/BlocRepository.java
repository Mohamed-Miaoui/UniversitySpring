package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Chambre;

import java.util.List;


public interface BlocRepository extends JpaRepository<Bloc,Long> {
    public Bloc findBlocByChambreList_idChambre(long idchambre);
}
