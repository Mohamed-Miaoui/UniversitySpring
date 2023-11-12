package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Foyer;
import tn.esprit.springproject.services.FoyerServiceImp;

import java.util.List;

@AllArgsConstructor
@RestController
public class FoyerController {

    @Autowired
    private FoyerServiceImp foyerServiceImp;

    @PostMapping("/addfoyer")
    public Foyer addFoyer(@RequestBody Foyer f){ // @RequestBody when we pass object
        return foyerServiceImp.addFoyer(f);
    }

    @PutMapping("/update")
    public Foyer updateFoyer(@RequestBody Foyer f){
        return foyerServiceImp.updateFoyer(f);
    }

    @GetMapping("/getall")
    public List<Foyer> findAllFoyer(){
        return foyerServiceImp.findAllFoyer();
    }

    @GetMapping("/getbyid/{id}")
    public Foyer findByIdFoyer(@PathVariable long id){ //@PathVariable cuz we pass the id in paramete to the path / when we passe just a variable
        return foyerServiceImp.findByIdFoyer(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable long id){
        foyerServiceImp.deleteFoyer(id);
    }

    @GetMapping("/getbyname/{nf}")
    public Foyer getByName(@PathVariable String nf){
        return foyerServiceImp.findByNomFoyer(nf);
    }



}
