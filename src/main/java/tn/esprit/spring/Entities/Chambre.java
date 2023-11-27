package tn.esprit.spring.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.engine.internal.Cascade;
import org.springframework.scheduling.annotation.EnableScheduling;
import tn.esprit.spring.Entities.enumerations.TypeChambre;

import java.io.Serializable;
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
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idChambre;

    long numeroChambre;
    TypeChambre typeC;
    @ManyToOne
    @JoinColumn(name = "id_Bloc")
    Bloc bloc;
    @OneToMany
    private List<Reservation> reservations;

}
