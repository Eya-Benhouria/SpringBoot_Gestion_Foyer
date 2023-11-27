package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Bloc;
import tn.esprit.spring.Entities.Chambre;
import tn.esprit.spring.repositories.BlocRepository;
import tn.esprit.spring.repositories.ChambreRepository;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
@AllArgsConstructor
public class BlocServiceImpl implements  IBlocService {
    BlocRepository blocRepository;
    ChambreRepository chambreRepository;

    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void removeBloc(long idBloc) {
        blocRepository.deleteById(idBloc);

    }

    @Override
    public Bloc affecterChambresABloc(List<Long> idChambre, Long idBloc) {

        Bloc bloc = blocRepository.findById(idBloc).orElse(null);

        for (Long id : idChambre) {
            Chambre chambre = chambreRepository.findById(id).orElse(null);
            chambre.setBloc(bloc);
            chambreRepository.save(chambre);
        }

        return blocRepository.save(bloc);
    }

    }

