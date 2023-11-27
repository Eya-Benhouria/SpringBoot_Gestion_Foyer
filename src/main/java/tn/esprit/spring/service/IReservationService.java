package tn.esprit.spring.service;

import tn.esprit.spring.Entities.Reservation;
import tn.esprit.spring.Entities.Universite;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservation();

    public Reservation updateReservation (Reservation res);
    public Reservation retrieveReservation (String idReservation);
    Reservation ajouterReservation (Long idChambre, Long cinEtudiant) ;
}
