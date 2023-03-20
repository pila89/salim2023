package com.example.salim.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idUser;
    private String nom;
    private String email;

    private Integer telephone;

    private String adresse;

    private String logo;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Role role;

    @OneToMany ()
    public List<Fournisseur> fournisseurs;
}

