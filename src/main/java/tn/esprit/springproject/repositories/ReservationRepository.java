package tn.esprit.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springproject.entites.Reservation;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    public List<Reservation> findByEtudiantList_nomEt(String name);
    public List<Reservation> findByEtudiantList_nomEtStartingWith(String préfix);
}
