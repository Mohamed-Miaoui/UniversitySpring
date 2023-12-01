package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.entites.Chambre;

import java.util.Set;

public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    public Set<Chambre> findChambresByBloc_idBloc(long idbloc);
}
