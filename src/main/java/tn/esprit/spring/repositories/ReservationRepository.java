package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Reservation;

@Repository
public interface ReservationRepository  extends JpaRepository<Reservation, String>{

   // List<Reservation> findAllByanneeUniversitaire(Date d);
    // List<Reservation> findByanneeUniversitaireBetween(Date dFrom, Date dTo);
}