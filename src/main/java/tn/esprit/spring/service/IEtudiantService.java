package tn.esprit.spring.service;

import tn.esprit.spring.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public List<Etudiant> addEtudiants (List<Etudiant> etudiants);
    public Etudiant updateEtudiant (Etudiant e);
    public Etudiant retrieveEtudiant(long idEtudiant);
    public void removeEtudiant(long idEtudiant);
}
