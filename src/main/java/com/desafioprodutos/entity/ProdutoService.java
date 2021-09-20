package com.desafioprodutos.entity;

import com.desafioprodutos.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private static List<Produto> listarProdutos = new ArrayList<Produto>();

    public Produto cadastra(Produto produto){
        listarProdutos.add(produto);
        Long idProduto = (long) listarProdutos.size();
        produto.setId(idProduto);
        return produto;
    }

    public List<Produto> listarProdutos(){

        return ProdutoService.listarProdutos;
    }

    public Produto getProduto(long id){
        for(Produto produto: listarProdutos){
            if(produto.getId().equals(id)){
                return produto;
            }
        }
        return null;
    }
}
