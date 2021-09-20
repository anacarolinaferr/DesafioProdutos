package com.desafioprodutos.model;


import lombok.Data;

@Data
public class Produto {

    private Long id;
    private String nome;
    private double peso;

    public Produto(){

    }

    public Produto(String nome, double peso) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }
}
