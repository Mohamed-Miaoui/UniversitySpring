package tn.esprit.springproject.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.entites.Reservation;
import tn.esprit.springproject.services.ReservationServiceImp;

import java.util.List;

@AllArgsConstructor
@RestController
public class ReservationController {
    private ReservationServiceImp ReservationServiceImp;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation f){ // @RequestBody when we pass object
        return ReservationServiceImp.addReservation(f);
    }

    @PutMapping("/updateRes")
    public Reservation updateReservation(@RequestBody Reservation f){
        return ReservationServiceImp.updateReservation(f);
    }

    @GetMapping("/reservations")
    public List<Reservation> findAllReservation(){
        return ReservationServiceImp.findAllReservation();
    }

    @GetMapping("/res/{id}")
    public Reservation findByIdReservation(@PathVariable long id){ //@PathVariable cuz we pass the id in paramete to the path / when we passe just a variable
        return ReservationServiceImp.findByIdReservation(id);
    }

    @DeleteMapping("/deleteRes/{id}")
    public void deleteById(@PathVariable long id){
        ReservationServiceImp.deleteReservation(id);
    }


}
