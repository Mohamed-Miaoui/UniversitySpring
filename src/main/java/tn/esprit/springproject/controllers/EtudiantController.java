package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Etudiant;
import tn.esprit.springproject.services.EtudiantServiceImp;

import java.util.List;

@AllArgsConstructor
@RestController
public class EtudiantController {
    private EtudiantServiceImp EtudiantServiceImp;

    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant f){ // @RequestBody when we pass object
        return EtudiantServiceImp.addEtudiant(f);
    }

    @PutMapping("/updateEtu")
    public Etudiant updateEtudiant(@RequestBody Etudiant f){
        return EtudiantServiceImp.updateEtudiant(f);
    }

    @GetMapping("/Etudiants")
    public List<Etudiant> findAllEtudiant(){
        return EtudiantServiceImp.findAllEtudiant();
    }

    @GetMapping("/etudiant/{id}")
    public Etudiant findByIdEtudiant(@PathVariable long id){ //@PathVariable cuz we pass the id in paramete to the path / when we passe just a variable
        return EtudiantServiceImp.findByIdEtudiant(id);
    }

    @DeleteMapping("/deleteEtu/{id}")
    public void deleteById(@PathVariable long id){
        EtudiantServiceImp.deleteEtudiant(id);
    }
}
