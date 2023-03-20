package com.example.salim.Repositories;

import com.example.salim.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("userRepository")
public interface UserRepositorie extends JpaRepository<User,Integer> {
    public User findByNom (String nom);

}
