package com.desafioprodutos.dto;

import com.desafioprodutos.model.Produto;

import java.io.Serializable;

public class ProdutoDTO implements Serializable {

    private String nome;
    private double peso;

    public ProdutoDTO(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "ProdutoDTO{" +
                "nome='" + nome + "\'" +
                ", peso=" + peso +
                "}";
    }

    public Produto converteParaProduto(){
        Produto produto = new Produto(this.nome,this.peso);
        return produto;
    }

    public static ProdutoDTO converteParaProdutoDto(Produto produto){
        ProdutoDTO produtoDTO = new ProdutoDTO(produto.getNome(),produto.getPeso());
        return produtoDTO;
    }
}
