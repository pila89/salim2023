package com.example.salim.Interfaces;

import com.example.salim.Entities.User;

import java.util.List;

public  interface UserInterface {

        public   User addUser(User user) ;
        public List<User> getAllUsers();

        public User getUserById(Integer id);

        public String deleteUserById(Integer id);

        public User updateUser(User user);

        public User getUserByNom(String nom);

    }


