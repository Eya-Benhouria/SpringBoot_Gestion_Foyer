package tn.esprit.spring.service;

import tn.esprit.spring.Entities.Foyer;
import tn.esprit.spring.Entities.Universite;

import java.util.List;

public interface IFoyerService {

    public List<Foyer> retrieveAllFoyers();

    public Foyer addFoyer (Foyer f);

    public Foyer updateFoyer (Foyer f);

    public Foyer retrieveFoyer (long idFoyer);

    public void removeFoyer (long idFoyer);

    public Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite);
    public Universite desaffecterFoyerAUniversite (long idFoyer) ;
    public Foyer ajouterFoyerEtAffecterAUniversite (Foyer foyer, long idUniversite) ;
}
