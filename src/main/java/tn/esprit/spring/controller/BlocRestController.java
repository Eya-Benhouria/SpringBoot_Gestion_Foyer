package tn.esprit.spring.controller;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entities.Bloc;
import tn.esprit.spring.Entities.Chambre;
import tn.esprit.spring.service.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    @Autowired
    IBlocService blocService;

    @GetMapping("/retrieve-AllBlocs")
    public List<Bloc> retrieveBlocs() {
        List<Bloc> listBlocs = blocService.retrieveBlocs();
        return listBlocs;
    }

    @PutMapping("/update-bloc")
    public Bloc updateBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.updateBloc(b);
        return bloc;
    }

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b){
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }

    @GetMapping("/retrieve-bloc/{id_bloc}")
    public Bloc retreiveBloc(@PathVariable("id_bloc") Long idBloc){
        Bloc bloc = blocService.retrieveBloc(idBloc);
        return bloc;
    }
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long idBloc){
        blocService.removeBloc(idBloc);
    }

    @PutMapping("/affecterChambres/{idBloc}")
    public Bloc affecterChambresABloc(@RequestBody List<Long> idChambre, @PathVariable Long idBloc) {
        return blocService.affecterChambresABloc(idChambre, idBloc);
    }
}
