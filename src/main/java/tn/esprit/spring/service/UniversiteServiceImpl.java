package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Foyer;
import tn.esprit.spring.Entities.Universite;
import tn.esprit.spring.repositories.FoyerRepository;
import tn.esprit.spring.repositories.UniversiteRepository;

import java.util.List;
import java.util.Optional;
@Slf4j
@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{

    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        Optional<Universite> universite = universiteRepository.findById(idUniversity);
        return universite.orElse(null);
    }


}
