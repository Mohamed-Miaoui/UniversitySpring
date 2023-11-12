package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.repositories.UniversiteRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class UniversiteServiceImp implements IUniversite{

  private  UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public List<Universite> findAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findByIdUniversite(long id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUniversite(long id) {
        universiteRepository.deleteById(id);
    }
}
