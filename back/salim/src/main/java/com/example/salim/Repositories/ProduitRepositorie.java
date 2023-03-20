package com.example.salim.Repositories;

import com.example.salim.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("produitRepositorie")
public interface ProduitRepositorie extends JpaRepository<Produit,Integer> {
}
