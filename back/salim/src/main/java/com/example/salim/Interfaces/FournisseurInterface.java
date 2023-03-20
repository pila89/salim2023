package com.example.salim.Interfaces;

import com.example.salim.Entities.Fournisseur;


import java.util.List;

public interface FournisseurInterface {
    public Fournisseur addFournisseur(Fournisseur fournisseur) ;

    public List<Fournisseur> getAllFournisseurs();

    public Fournisseur getFournisseurById(Integer id);

    public String deleteFournisseurById(Integer id);

    public Fournisseur updateFournisseur(Fournisseur fournisseur);

    public Fournisseur getFournisseurByName(String nom);

}
