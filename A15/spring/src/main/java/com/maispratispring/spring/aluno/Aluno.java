package com.maispratispring.spring.aluno;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
    @Id
    private String nome;
    private Integer id;
    private Integer matricula;

    private String email;
}
