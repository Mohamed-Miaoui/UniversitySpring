package tn.esprit.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Reservation;
import tn.esprit.springproject.repositories.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImp implements IReservation {
    private ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation b) {
        return reservationRepository.save(b);
    }

    @Override
    public Reservation updateReservation(Reservation b) {
        return reservationRepository.save(b);
    }

    @Override
    public List<Reservation> findAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findByIdReservation(long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteReservation(long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> findByEtudiantListnomEt(String name) {
        return reservationRepository.findByEtudiantList_nomEt(name);
    }

    @Override
    public List<Reservation> findByEtudiantListnomEtStartingWith(String préfix) {
        return reservationRepository.findByEtudiantList_nomEtStartingWith(préfix);
    }
}
