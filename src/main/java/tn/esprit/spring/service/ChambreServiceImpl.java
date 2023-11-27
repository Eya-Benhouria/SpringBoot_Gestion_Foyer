package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Chambre;
import tn.esprit.spring.repositories.ChambreRepository;

import java.util.List;
@Slf4j
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements ICchambreService{
    ChambreRepository chambreRepositoy;
    @Scheduled(fixedDelay = 10000)
    @Override
    public List<Chambre> retrieveAllChambre() {
        List<Chambre> listC = chambreRepositoy.findAll();
        for (Chambre c: listC) {
            log.info("Chambre :" + c);
        }
        return listC;
    }

    @Override
    public Chambre retreiveChambre(long chambreId) {
        return chambreRepositoy.findById(chambreId).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        log.info("Success");
        return chambreRepositoy.save(c);
    }

    @Override
    public void removeChambre(long chambreId) {
        chambreRepositoy.deleteById(chambreId);

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
       return chambreRepositoy.save(chambre);
    }
}
