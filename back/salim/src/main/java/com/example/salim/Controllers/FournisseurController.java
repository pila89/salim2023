package com.example.salim.Controllers;

import com.example.salim.Entities.Fournisseur;
import com.example.salim.Entities.User;
import com.example.salim.ServicesImplement.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseurs")
public class FournisseurController extends FournisseurService {

    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping("/getAllFournisseurs")
    public List<Fournisseur> getAllFournisseurs(){
        return  fournisseurService.getAllFournisseurs();
    }

    @GetMapping("/getFournisseur/{id}")
    public Fournisseur getUser(@PathVariable("id")Integer id){
        return  fournisseurService.getFournisseurById(id);
    }
    @PostMapping("/addFournisseur")
    public Fournisseur addUser(@RequestBody Fournisseur fournisseur){
        return  fournisseurService.addFournisseur(fournisseur);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteFournisseur(@PathVariable ("id")Integer id){
        return  fournisseurService.deleteFournisseurById(id);
    }
    @PutMapping("/update")
    public Fournisseur updateFournisseur(@RequestBody Fournisseur fournisseur){
        return  fournisseurService.updateFournisseur(fournisseur);
    }

    @GetMapping("/getFournisseurByNom/{nom}")
    public Fournisseur getFournisseur(@PathVariable ("nom") String nom){
        return  fournisseurService.getFournisseurByName(nom);
    }

}
