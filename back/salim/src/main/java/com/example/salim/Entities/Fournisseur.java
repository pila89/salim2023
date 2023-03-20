package com.example.salim.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer idFournisseur ;
    private String nom;
    private String email;

    private Integer telephone;

    private String adresse;

    private String logo;

    @OneToMany
    public List<Produit> produits;
}
