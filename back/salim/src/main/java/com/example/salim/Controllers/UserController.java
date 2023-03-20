package com.example.salim.Controllers;

import com.example.salim.Entities.User;
import com.example.salim.ServicesImplement.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/",exposedHeaders="Access-Control-Allow-Origin" )
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUsers")
   public List<User> getAllUsers(){
        return  userService.getAllUsers();
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable ("id")Integer id){
        return  userService.getUserById(id);
    }
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){

        return  userService.addUser(user);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable ("id")Integer id){
        return  userService.deleteUserById(id);
    }
    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return  userService.updateUser(user);
    }

    @GetMapping("/getUserByNom/{nom}")
    public User getUser(@PathVariable ("nom") String nom){
        return  userService.getUserByNom(nom);
    }

}
