package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Etudiant;

import java.util.List;

public interface IEtudiant {
    public Etudiant addEtudiant(Etudiant b);
    public Etudiant updateEtudiant(Etudiant b);
    public List<Etudiant> findAllEtudiant();
    public Etudiant findByIdEtudiant(long id);
    public void deleteEtudiant(long id);
}
