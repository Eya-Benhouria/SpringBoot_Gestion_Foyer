package tn.esprit.spring.service;

import tn.esprit.spring.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversities();

    public Universite addUniversity (Universite u);

    public Universite updateUniversity (Universite u);

    public Universite retrieveUniversity (long idUniversity);
}
