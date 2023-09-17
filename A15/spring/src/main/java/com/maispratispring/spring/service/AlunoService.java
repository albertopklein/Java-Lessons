package com.maispratispring.spring.service;

import com.maispratispring.spring.model.Aluno;
import com.maispratispring.spring.repository.AlunoRepository;
import com.maispratispring.spring.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    public void salvarOuAtualizarAluno(Aluno aluno){
        this.alunoRepository.save(aluno);
    }

    public Aluno buscarAlunoPorId(Integer id){
        return this.alunoRepository.findById(id).orElse(null);
    }

    public void removerPorId(Integer id){
        this.alunoRepository.deleteById(id);
    }
    public List<Aluno> buscarTodos(){
        return this.alunoRepository.findAll();
    }
}
