package com.maispratispring.spring.rest;

import com.maispratispring.spring.model.Aluno;
import com.maispratispring.spring.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno") //localhost:8080/aluno/
public class AlunoControlller {
    @Autowired
    AlunoService alunoService;
    //localhost:8080/aluno/salvar
    @PostMapping("/salvar")
    public void salvarAluno(@RequestBody Aluno aluno){
        this.alunoService.salvarOuAtualizarAluno(aluno);
    }
}
