package br.univille.sistemachocolateria.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "empresa_id")
    private List<Franquiado> colFranquiados = new ArrayList<>(); 
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Franquiado> getColFranquiados() {
        return colFranquiados;
    }
    public void setColFranquiados(List<Franquiado> colFranquiados) {
        this.colFranquiados = colFranquiados;
    }
   
}
