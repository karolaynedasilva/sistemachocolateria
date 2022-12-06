package br.univille.sistemachocolateria.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Franquiado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "Campo obrigatório")
    private String nome;
    @NotBlank(message = "Campo obrigatório")
    private String CNPJ; 
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    @NotBlank(message = "Campo obrigatório")
    private String email;
    @NotBlank(message = "Campo obrigatório")
    private String telefone;
    
    //TODO private List<Produtos> produtos;

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
    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
    
    
}
