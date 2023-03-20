package com.example.salim.Repositories;

import com.example.salim.Entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepositorie")
public interface RoleRepositorie extends JpaRepository<Role,Integer> {
}
