package com.example.salim.ServicesImplement;

import com.example.salim.Entities.Fournisseur;
import com.example.salim.Entities.Produit;

import com.example.salim.Interfaces.ProduitInterface;

import com.example.salim.Repositories.FournisseurRepositorie;
import com.example.salim.Repositories.ProduitRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service

public class ProduitService implements ProduitInterface {
    @Autowired
    private ProduitRepositorie produitRepositorie;
    @Autowired
    private FournisseurService fournisseurService;
    @Autowired
    private FournisseurRepositorie fournisseurRepositorie;

    @Override
    public Produit addProduit(Produit produit) {
        return produitRepositorie.save(produit);
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepositorie.findAll();
    }

    @Override
    public Produit getProduitById(Integer id) {
        return produitRepositorie.findById(id).orElse(null);
    }

    @Override
    public String deleteProduitById(Integer id) {
        produitRepositorie.deleteById(id);
        return "ok";
    }
    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepositorie.save(produit);
    }

    @Override
    public Produit addProduitToFournisseur(Produit produit, Integer idFournisseur) {
       produitRepositorie.save(produit);
        Fournisseur foundedFournisseur = fournisseurService.getFournisseurById(idFournisseur);
        foundedFournisseur.getProduits().add(produit);
        fournisseurRepositorie.save(foundedFournisseur);

        return produit;
    }
}
