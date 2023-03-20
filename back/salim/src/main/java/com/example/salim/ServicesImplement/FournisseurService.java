package com.example.salim.ServicesImplement;

import com.example.salim.Entities.Fournisseur;
import com.example.salim.Interfaces.FournisseurInterface;
import com.example.salim.Repositories.FournisseurRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FournisseurService implements FournisseurInterface {

    @Autowired
    private FournisseurRepositorie fournisseurRepositorie;

    @Override
    public Fournisseur addFournisseur(Fournisseur fournisseur) {
        return fournisseurRepositorie.save(fournisseur);
    }

    @Override
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepositorie.findAll();
    }

    @Override
    public Fournisseur getFournisseurById(Integer id) {
        return fournisseurRepositorie.findById(id).orElse(null);
    }

    @Override
    public String deleteFournisseurById(Integer id) {
         fournisseurRepositorie.deleteById(id);
        return "ok";
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur fournisseur) {
        return fournisseurRepositorie.save(fournisseur);
    }

    @Override
    public Fournisseur getFournisseurByName(String nom) {
        return fournisseurRepositorie.findByNom(nom);
    }
}
