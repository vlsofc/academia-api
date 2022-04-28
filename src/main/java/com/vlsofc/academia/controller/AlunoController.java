package com.vlsofc.academia.controller;

import com.vlsofc.academia.model.Aluno;
import com.vlsofc.academia.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/aluno")
    public List<Aluno> listarAlunos(){
        return alunoRepository.findAll();
    }

    @GetMapping("/aluno/{id}")
    public Aluno listarAlunoById(@PathVariable Long id){
        return alunoRepository.findById(id).get();
    }

    @PostMapping("/aluno")
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno adicionarAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @DeleteMapping("/aluno/{id}")
    public void deletarAluno(@PathVariable Long id){
        alunoRepository.deleteById(id);
    }
}
