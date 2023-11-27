package tn.esprit.spring.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.apache.bcel.generic.RET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entities.Etudiant;
import tn.esprit.spring.Entities.Foyer;
import tn.esprit.spring.Entities.Universite;
import tn.esprit.spring.service.IFoyerService;
import tn.esprit.spring.service.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/university")
public class UniversiteRestController {
    @Autowired
    IUniversiteService universiteService;
    @Autowired
    IFoyerService foyerService;

    @GetMapping("/retrieve-AllUniversity")
    public List<Universite> retrieveAllUniversities() {
        List<Universite> listUniversities = universiteService.retrieveAllUniversities();

        return listUniversities;
    }

    @PostMapping("/add-university")
    public Universite addUniversity(@RequestBody Universite u){
        Universite universite = universiteService.addUniversity(u);
        return  universite;
    }

    @PutMapping("/update-university")
    public Universite updateUniversity(@RequestBody Universite u) {
        Universite universite = universiteService.updateUniversity(u);
        return universite;
    }

    @GetMapping("/retrieve-university/{id_university}")
    public Universite  retrieveUniversity(@PathVariable("id_university") Long idUniversity){
        Universite universite = universiteService.retrieveUniversity(idUniversity);
        return universite;
    }


}
