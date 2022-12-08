package br.univille.sistemachocolateria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 2000)
    @NotBlank(message = "Favor inserir a marca")
    private String marca;

    @Column(length = 2000)
    @NotBlank(message = "Favor inserir o tipo")
    private String tipo;

    /*
     * @Max(value = 100, message = "some key or default message")
     * 
     * @Min(value = 1, message = "some key or default message")
     */
    @DecimalMin(value = "1", message = "Valor mínimo é um")
    @NotNull(message = "Valor mínimo é um")
    private Double valor = 0d;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
