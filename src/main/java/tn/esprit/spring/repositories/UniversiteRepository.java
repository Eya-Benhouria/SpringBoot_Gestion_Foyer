
package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Foyer;
import tn.esprit.spring.Entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    public Universite findByNomUniversiteAndAdresse(String nom,String adresse);
    public  Universite findByNomUniversite(String nomUniversite);

}