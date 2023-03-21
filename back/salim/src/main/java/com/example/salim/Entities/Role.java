package com.example.salim.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Role implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

private Integer id;

    @Enumerated(EnumType.STRING)
    private Roles role;

}
