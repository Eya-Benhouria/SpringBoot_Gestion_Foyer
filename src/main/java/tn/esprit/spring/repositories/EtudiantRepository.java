package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Etudiant;

import java.util.*;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant,Long> {
    Etudiant findByCin(Long cin);
}
