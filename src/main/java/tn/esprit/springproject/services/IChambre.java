package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Chambre;

import java.util.List;

public interface IChambre {
    public Chambre addChambre(Chambre b);
    public Chambre updateChambre(Chambre b);
    public List<Chambre> findAllChambre();
    public Chambre findByIdChambre(long id);
    public void deleteChambre(long id);
}
