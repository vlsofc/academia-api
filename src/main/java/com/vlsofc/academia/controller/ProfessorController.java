package com.vlsofc.academia.controller;

import com.vlsofc.academia.model.Professor;
import com.vlsofc.academia.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/professor")
    private List<Professor> listarProfessores(){
        return professorRepository.findAll();
    }

    @GetMapping("/professor/{id}")
    private Professor listarProfessorById(@PathVariable Long id){
        return professorRepository.findById(id).get();
    }

    @PostMapping("/professor")
    @ResponseStatus(HttpStatus.CREATED)
    private Professor adicionarProfessor(@RequestBody Professor professor){
        return professorRepository.save(professor);
    }

    @DeleteMapping("/professor/{id}")
    private void deletarProfessor(@PathVariable Long id){
        professorRepository.deleteById(id);
    }
}
