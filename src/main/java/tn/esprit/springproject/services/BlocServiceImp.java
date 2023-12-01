package tn.esprit.springproject.services;

import org.springframework.stereotype.Service;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.repositories.BlocRepository;

import java.util.List;

@Service
public class BlocServiceImp implements IBloc{
    private BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> findAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findByIdBloc(long id) {
        return blocRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBloc(long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc findBlocByChambreListidChambre(long idchambre) {
        return blocRepository.findBlocByChambreList_idChambre(idchambre);
    }
}
