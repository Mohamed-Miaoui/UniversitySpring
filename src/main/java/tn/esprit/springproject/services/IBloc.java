package tn.esprit.springproject.services;

import tn.esprit.springproject.entites.Bloc;

import java.util.List;

public interface IBloc {
    public Bloc addBloc(Bloc b);
    public Bloc updateBloc(Bloc b);
    public List<Bloc> findAllBloc();
    public Bloc findByIdBloc(long id);
    public void deleteBloc(long id);
}
