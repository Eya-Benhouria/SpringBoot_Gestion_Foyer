package tn.esprit.spring.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entities.Chambre;
import tn.esprit.spring.service.ICchambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {

    @Autowired
    ICchambreService chambreService;
    // http://localhost:8080/tpFoyer/chambre/retrieve-Allchambres
    @GetMapping("/retrieve-Allchambres")
    public List<Chambre> getChambre() {
        List<Chambre> listChambres = chambreService.retrieveAllChambre();


        return listChambres;
    }
    // http://localhost:8080/tpFoyer/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-chambre/{id_chambre}")
    public Chambre retreiveChambre(@PathVariable("id_chambre") Long chId){
        Chambre chambre = chambreService.retreiveChambre(chId);
        return chambre;
    }
    
    // http://localhost:8080/tpFoyer/chambre/add-chambre
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c){
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
    // http://localhost:8089/tpFoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId){
        chambreService.removeChambre(chId);
    }
    // http://localhost:8089/tpFoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }


}
