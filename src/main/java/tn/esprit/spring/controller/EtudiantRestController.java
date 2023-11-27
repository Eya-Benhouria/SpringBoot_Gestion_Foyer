package tn.esprit.spring.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entities.Chambre;
import tn.esprit.spring.Entities.Etudiant;
import tn.esprit.spring.service.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {
    @Autowired
    IEtudiantService etudiantService;

    @GetMapping("/retrieve-AllEtudiants")
    public List<Etudiant> retrieveAllEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();

        return listEtudiants;
    }

    @PostMapping("/add-etudiant")
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants){
        List<Etudiant> addedEtudiants = etudiantService.addEtudiants(etudiants);
        return addedEtudiants;
    }

    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.updateEtudiant(e);
        return etudiant;
    }

    @GetMapping("/retrieve-etudiant/{id_etudiant}")
    public Etudiant  retrieveEtudiant(@PathVariable("id_etudiant") Long idEtudiant){
        Etudiant etudiant = etudiantService.retrieveEtudiant(idEtudiant);
        return etudiant;
    }
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long idEtudiant){
        etudiantService.removeEtudiant(idEtudiant);
    }


}
