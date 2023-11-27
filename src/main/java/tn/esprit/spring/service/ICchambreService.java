package tn.esprit.spring.service;

import tn.esprit.spring.Entities.Chambre;

import java.util.List;

public interface ICchambreService {
    public List<Chambre> retrieveAllChambre();
    public  Chambre retreiveChambre(long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(long chambreId);
    public Chambre modifyChambre(Chambre chambre);


}
