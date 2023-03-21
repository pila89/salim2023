package com.example.salim.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idProduit;

    private String labelle;

    private String photoface;

    private String photoProfil;

    private Integer prix;

    private String description;

    private Integer quantiteSotock;

    private Integer prixPromotion;

    private String dateExpiration;

}
