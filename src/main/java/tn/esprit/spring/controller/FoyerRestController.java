package tn.esprit.spring.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entities.Chambre;
import tn.esprit.spring.Entities.Foyer;
import tn.esprit.spring.Entities.Universite;
import tn.esprit.spring.service.ICchambreService;
import tn.esprit.spring.service.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {
    @Autowired
    IFoyerService foyerService;

    @GetMapping("/retrieve-AllFoyers")
    public List<Foyer> retrieveAllFoyers() {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;
    }

    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f){
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }

    @PutMapping("/update-foyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.updateFoyer(f);
        return foyer;
    }


    @GetMapping("/retrieve-foyer/{id_foyer}")
    public Foyer retrieveFoyer(@PathVariable("id_foyer") Long idFoyer){
        Foyer foyer = foyerService.retrieveFoyer(idFoyer);
        return foyer;
    }

    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long idFoyer){
        foyerService.removeFoyer(idFoyer);
    }

    @PutMapping ("/affecterFoyer/{idFoyer}/{nomUniversite}")
    public void affectation(@PathVariable("idFoyer") Long idFoyer, @PathVariable("nomUniversite") String nomUniversite){
        foyerService.affecterFoyerAUniversite(idFoyer, nomUniversite);
    }
    @PutMapping ("/DesaffecterFoyer/{idUniversite}")
    public void Desaffectation(@PathVariable("idUniversite") long idUniversite){
        foyerService.desaffecterFoyerAUniversite(idUniversite);
    }
    @PostMapping("/ajouterFoyerEtAffecterAUniversite")
    public Foyer ajouterFoyerEtAffecterAUniversite(@RequestBody Foyer foyer, @RequestParam long idUniversite) {
        return foyerService.ajouterFoyerEtAffecterAUniversite(foyer, idUniversite);
    }
}
