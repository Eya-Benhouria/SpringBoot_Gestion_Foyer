package tn.esprit.spring.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entities.Chambre;
import tn.esprit.spring.Entities.Reservation;
import tn.esprit.spring.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestContoller {

    @Autowired
    IReservationService reservationService;

    @GetMapping("/retrieve-AllReservations")
    public List<Reservation> retrieveAllReservation() {
        List<Reservation> listReservations = reservationService.retrieveAllReservation();
        return listReservations;
    }

    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation res) {
        Reservation reservation = reservationService.updateReservation(res);
        return reservation;
    }

    @GetMapping("/retrieve-reservation/{id_reservation}")
    public Reservation retrieveReservation(@PathVariable("id_reservation") String idReservation){
        Reservation reservation = reservationService.retrieveReservation(idReservation);
        return reservation;
    }
    @PostMapping("/add/{idChambre}/{cin}")
    public Reservation ajouterReservation(@PathVariable Long idChambre, @PathVariable Long cin) {
        return reservationService.ajouterReservation(idChambre, cin);
    }

}
