package com.example.salim.Repositories;

import com.example.salim.Entities.Fournisseur;
import com.example.salim.Entities.Produit;
import com.example.salim.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("fournissseurRepositorie")
public interface FournisseurRepositorie extends JpaRepository<Fournisseur,Integer> {
    public Fournisseur findByNom (String nom);
}
