package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Foyer;

// JpaRepository ta3tina typical crud
public interface FoyerRepository extends JpaRepository<Foyer,Long> { //<class(entity),id type(no primitive)

    //CRUD specialisé n5demhom manually
    public Foyer findByNomFoyer(String nomFoyer);

}
