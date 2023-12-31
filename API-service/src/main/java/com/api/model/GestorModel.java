package com.api.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Miguel Castro
 */
@Entity
@Schema(name = "Gestor - model")
public class GestorModel implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private Integer score_senha;


    public GestorModel() {
    }

    public GestorModel(Long id, String nome, String senha, Integer score_senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.score_senha = score_senha;
    }
    
    public GestorModel(String nome, String senha, Integer score_senha) {
        this.nome = nome;
        this.senha = senha;
        this.score_senha = score_senha;
    }

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getScore_senha() {
        return score_senha;
    }

    public void setScore_senha(Integer score_senha) {
        this.score_senha = score_senha;
    }
}
