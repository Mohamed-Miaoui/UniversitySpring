package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Reservation;

import java.util.List;

public interface IReservation {
    public Reservation addReservation(Reservation r);
    public Reservation updateReservation(Reservation r);
    public List<Reservation> findAllReservation();
    public Reservation findByIdReservation(long id);
    public void deleteReservation(long id);
    public List<Reservation> findByEtudiantListnomEt(String name);
    public List<Reservation> findByEtudiantListnomEtStartingWith(String préfix);
}
