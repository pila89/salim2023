package com.example.salim.Interfaces;

import com.example.salim.Entities.Fournisseur;
import com.example.salim.Entities.Produit;
import com.example.salim.Entities.User;

import java.util.List;
import java.util.Optional;

public interface ProduitInterface {

    public Produit addProduit(Produit produit) ;

    public Produit addProduitToFournisseur(Produit produit, Integer idFournisseur);
    public List<Produit> getAllProduits();

    public  Produit getProduitById(Integer id);



    public String deleteProduitById(Integer id);

    public Produit updateProduit(Produit produit);





}
