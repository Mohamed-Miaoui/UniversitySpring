package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Chambre;
import tn.esprit.springproject.services.ChambreServiceImp;

import java.util.List;

@AllArgsConstructor
@RestController
public class ChambreController {
    private ChambreServiceImp chambreServiceImp;

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre f){ // @RequestBody when we pass object
        return chambreServiceImp.addChambre(f);
    }

    @PutMapping("/updatecham")
    public Chambre updateChambre(@RequestBody Chambre f){
        return chambreServiceImp.updateChambre(f);
    }

    @GetMapping("/Chambres")
    public List<Chambre> findAllChambre(){
        return chambreServiceImp.findAllChambre();
    }

    @GetMapping("/Chambre/{id}")
    public Chambre findByIdChambre(@PathVariable long id){ //@PathVariable cuz we pass the id in paramete to the path / when we passe just a variable
        return chambreServiceImp.findByIdChambre(id);
    }

    @DeleteMapping("/deleteEcham/{id}")
    public void deleteById(@PathVariable long id){
        chambreServiceImp.deleteChambre(id);
    }
}
