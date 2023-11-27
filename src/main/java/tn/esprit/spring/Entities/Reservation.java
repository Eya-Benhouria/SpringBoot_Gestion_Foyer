package tn.esprit.spring.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.scheduling.annotation.EnableScheduling;
import tn.esprit.spring.Entities.Chambre;
import tn.esprit.spring.Entities.Etudiant;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EnableScheduling
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table( name ="Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReservation; // Clé primaire

    String numReservation;
    @Temporal(TemporalType.DATE)
    LocalDate debutAnneeUniv;

    @Temporal(TemporalType.DATE)
    LocalDate finAnneeUniv;
    boolean estValide;
    @ManyToMany
    Set<Etudiant> etudiants;



}
