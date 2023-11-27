package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Bloc;
import tn.esprit.spring.Entities.Chambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository <Chambre,Long> {

}