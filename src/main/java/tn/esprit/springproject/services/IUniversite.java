package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.entites.Universite;

import java.util.List;

public interface IUniversite {
    public Universite addUniversite(Universite u);
    public Universite updateUniversite(Universite u);
    public List<Universite> findAllUniversite();
    public Universite findByIdUniversite(long id);
    public void deleteUniversite(long id);
}
