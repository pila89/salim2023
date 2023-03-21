package com.example.salim.Controllers;

import com.example.salim.Entities.Produit;
import com.example.salim.ServicesImplement.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200/",exposedHeaders="Access-Control-Allow-Origin" )
@RestController
@RequestMapping("/produits")
public class ProduitController {
        @Autowired
        public ProduitService produitService;
        @GetMapping("/getAllProduits")
        public List<Produit> getAllProduits(){
            return  produitService.getAllProduits();
        }
        @PostMapping("/addProduit")
        public Produit addProduit(@RequestBody Produit produit){
            return  produitService.addProduit(produit);
        }

        @GetMapping("/Produit/{id}")
        public Produit getProduitById(@PathVariable Integer id){
            return  produitService.getProduitById(id);
        }
        @DeleteMapping ("/produit/{id}")
        public String deleteProduitById(@PathVariable Integer id){
            return produitService.deleteProduitById(id);
        }
        @PutMapping("/update")
        public Produit updateProduit (@RequestBody Produit produit){
            return produitService.updateProduit(produit);
        }
    @PostMapping("/addProduitToFournisseur/{id}")
    public Produit addProduitToFournisseur(@RequestBody Produit produit ,@PathVariable Integer id){
        return produitService.addProduitToFournisseur(produit,id);

    }
}
