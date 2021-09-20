package com.desafioprodutos.controller;


import com.desafioprodutos.dto.ProdutoDTO;
import com.desafioprodutos.entity.ProdutoService;
import com.desafioprodutos.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

        @Autowired
        private ProdutoService produtoService;

        @PostMapping("/cadastra")
        public ResponseEntity<ProdutoDTO> cadastraProduto(@RequestBody ProdutoDTO produtoDto, UriComponentsBuilder uriBuilder){
            Produto produto = produtoDto.converteParaProduto();
            Produto produtoCadastrado = produtoService.cadastra(produto);

            URI uri = uriBuilder.path("/produto/{id}").buildAndExpand(produtoCadastrado.getId()).toUri();
            return ResponseEntity.created(uri).body(ProdutoDTO.converteParaProdutoDto(produtoCadastrado));
        }

        @GetMapping("/{id}")
        public Produto getProdutoPorId(@PathVariable("id") Long id){
            Produto produto = produtoService.getProduto(id);
            return produto;
        }

}
