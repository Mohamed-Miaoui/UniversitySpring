package tn.esprit.springproject.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.entites.Universite;
import tn.esprit.springproject.services.UniversiteServiceImp;

import java.util.List;


@AllArgsConstructor
@RestController
public class UniversiteController {

    private UniversiteServiceImp universiteServiceImp;

    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite u){ // @RequestBody when we pass object
        return universiteServiceImp.addUniversite(u);
    }

    @PutMapping("/updateU")
    public Universite updateUniversite(@RequestBody Universite u){
        return universiteServiceImp.updateUniversite(u);
    }

    @GetMapping("/getallU")
    public List<Universite> findAllUniversite(){
        return universiteServiceImp.findAllUniversite();
    }

    @GetMapping("/Universties/{id}")
    public Universite findByIdUniversite(@PathVariable long id){ //@PathVariable cuz we pass the id in paramete to the path / when we passe just a variable
        return universiteServiceImp.findByIdUniversite(id);
    }

    @DeleteMapping("/deleteUni/{id}")
    public void deleteById(@PathVariable long id){
        universiteServiceImp.deleteUniversite(id);
    }

    @PostMapping("/addUniverstyAndAssaignFoyer/{idF}")
    public Universite addUniverstyAndAssaignFoyer(@RequestBody Universite u,@PathVariable long idF){
        return universiteServiceImp.addUniverstyAndAssaignFoyer(u,idF);
    }

}
