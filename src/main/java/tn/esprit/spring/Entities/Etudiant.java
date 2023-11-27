package tn.esprit.spring.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.Serializable;
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
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEtudiant;
    String nomEtudiant;
    String prenomEtudiant;
    String ecole;
    @Column(unique=true)
    Long cin;
    @Temporal(TemporalType.DATE)
    Date dateDeNaissance;

    @ManyToMany(mappedBy="etudiants")
    @JsonIgnore
    Set<Reservation> reservations;

}