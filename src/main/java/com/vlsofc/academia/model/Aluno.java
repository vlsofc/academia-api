package com.vlsofc.academia.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = Aluno.TABLE_NAME)
public class Aluno {

    public static final String TABLE_NAME = "tb_aluno";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_al")
    private Long id;

    @Column(name = "nome_al" ,nullable = false)
    private String nome;

    @Column(name = "cpf_al" ,length = 11, nullable = false)
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
        Aluno aluno = (Aluno) o;
        return id.equals(aluno.id) && nome.equals(aluno.nome) && cpf.equals(aluno.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf);
    }
}
