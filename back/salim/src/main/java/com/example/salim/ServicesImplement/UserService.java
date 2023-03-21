package com.example.salim.ServicesImplement;

import com.example.salim.Entities.User;
import com.example.salim.Interfaces.UserInterface;
import com.example.salim.Repositories.UserRepositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class UserService implements UserInterface {
@Autowired
    private UserRepositorie userRepositorie;

    @Override
    public User addUser(User user) {

        return userRepositorie.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositorie.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        return userRepositorie.findById(id).orElse(null);
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepositorie.deleteById(id);

    }

    @Override
    public User updateUser(User user) {
        return userRepositorie.save(user);
    }

    @Override
    public User getUserByNom(String nom) {

        return userRepositorie.findByNom(nom);
    }

}
