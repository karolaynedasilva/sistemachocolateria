package br.univille.sistemachocolateria.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String rg;
    private int idade;
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}
