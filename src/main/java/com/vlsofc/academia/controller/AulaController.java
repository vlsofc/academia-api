package com.vlsofc.academia.controller;

import com.vlsofc.academia.model.Aula;
import com.vlsofc.academia.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AulaController {

    @Autowired
    private AulaRepository aulaRepository;

    @GetMapping("/aula")
    private List<Aula> aulas(){
        return aulaRepository.findAll();
    }

    @GetMapping("/aula/{id}")
    private Aula aulaById(@PathVariable Long id){
        return aulaRepository.findById(id).get();
    }

    @PostMapping("/aula")
    @ResponseStatus(HttpStatus.CREATED)
    private Aula adicionarAula(@RequestBody Aula aula){
        return aulaRepository.save(aula);
    }

    @DeleteMapping("/aula/{id}")
    private void deletarAula(@PathVariable Long id){
        aulaRepository.deleteById(id);
    }
}
