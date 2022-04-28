package com.vlsofc.academia.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = Professor.TABLE_NAME)
public class Professor {

    public static final String TABLE_NAME = "tb_professor";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pf")
    private Long id;

    @Column(name = "nome_pf")
    private String nome;

    @Column(name = "cpf_pf", length = 11, nullable = false)
    private String cpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return id.equals(professor.id) && Objects.equals(nome, professor.nome) && Objects.equals(cpf, professor.cpf) /*&& Objects.equals(aula, professor.aula)*/;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf/*, aula*/);
    }
}
