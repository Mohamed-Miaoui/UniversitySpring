package tn.esprit.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.repositories.ChambreRepository;

import java.util.List;

@Service
public class ChambreServiceImp implements IChambre{
    private ChambreRepository chambreRepository;
    @Override
    public Chambre addChambre(Chambre b) {
        return chambreRepository.save(b);
    }

    @Override
    public Chambre updateChambre(Chambre b) {
        return chambreRepository.save(b);
    }

    @Override
    public List<Chambre> findAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findByIdChambre(long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteChambre(long id) {
        chambreRepository.deleteById(id);
    }
}
