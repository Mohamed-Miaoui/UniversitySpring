package tn.esprit.springproject.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.repositories.FoyerRepository;

import java.util.List;

//@AllArgsConstructor
@Service
public class FoyerServiceImp implements IFoyer{

    @Autowired
    private FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> findAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findByIdFoyer(long id) {
        return foyerRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteFoyer(long id) {
        foyerRepository.deleteById(id);

    }

    @Override
    public Foyer findByNomFoyer(String nomFoyer) {
        return foyerRepository.findByNomFoyer(nomFoyer);
    }
}
