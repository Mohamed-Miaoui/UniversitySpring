package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Bloc;
import tn.esprit.springproject.services.BlocServiceImp;

import java.util.List;

@AllArgsConstructor
@RestController
public class BlocController {
    private BlocServiceImp blocServiceImp;

    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc u){ // @RequestBody when we pass object
        return blocServiceImp.addBloc(u);
    }

    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc u){
        return blocServiceImp.updateBloc(u);
    }

    @GetMapping("/blocs")
    public List<Bloc> findAllBloc(){
        return blocServiceImp.findAllBloc();
    }

    @GetMapping("/bloc/{id}")
    public Bloc findByIdBloc(@PathVariable long id){ //@PathVariable cuz we pass the id in paramete to the path / when we passe just a variable
        return blocServiceImp.findByIdBloc(id);
    }

    @DeleteMapping("/deletebloc/{id}")
    public void deleteById(@PathVariable long id){
        blocServiceImp.deleteBloc(id);
    }

    @GetMapping("/chambre/{idchambre}")
    public Bloc findBlocByChambreListidChambre(@PathVariable long idchambre) {
        return blocServiceImp.findBlocByChambreListidChambre(idchambre);
    }
}
