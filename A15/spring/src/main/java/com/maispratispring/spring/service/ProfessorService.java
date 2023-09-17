package com.maispratispring.spring.service;

import com.maispratispring.spring.model.Professor;
import com.maispratispring.spring.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public Professor SalvarOuAtualizar(Professor professor){
        return this.professorRepository.save(professor);
    }

    public Professor buscarPorId(Integer id){
        return this.professorRepository.findById(id).orElse(null);
    }

    public List<Professor> buscarTodos(){
        return this.professorRepository.findAll();
    }

    public void removerPorId(Integer id){
        this.professorRepository.deleteById(id);
    }
}
