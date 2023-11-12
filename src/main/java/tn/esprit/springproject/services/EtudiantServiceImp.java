package tn.esprit.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.repositories.EtudiantRepository;

import java.util.List;

@Service
public class EtudiantServiceImp implements IEtudiant{
    private EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addEtudiant(Etudiant b) {
        return etudiantRepository.save(b);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant b) {
        return etudiantRepository.save(b);
    }

    @Override
    public List<Etudiant> findAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findByIdEtudiant(long id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteEtudiant(long id) {
        etudiantRepository.deleteById(id);
    }
}
