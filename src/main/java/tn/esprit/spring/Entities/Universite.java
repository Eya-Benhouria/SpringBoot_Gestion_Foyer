package tn.esprit.spring.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EnableScheduling
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long idUniversite;
    String nomUniversite;
    String adresse;
    @OneToOne
    private Foyer foyers;
    public void setFoyer(Foyer f){

    }

}
