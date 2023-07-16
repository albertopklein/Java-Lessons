package com.maispratiabril.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    private String nome;
    private Integer id;
    private Integer matricula;

    private String email;
}
