package com.br.codenation.controller;

import com.br.codenation.models.Produto;
import com.br.codenation.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/")
    public List<Produto> getAll (){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Produto getAllById (@PathVariable Long id){
            return repository.findById(id).get();
    }

    @PostMapping
    public Produto postProduct (@RequestBody Produto prod){
        return repository.save(prod);
    }

    @PutMapping("/{id}")
    public Produto editProductById(@RequestBody Produto prod, @PathVariable Long id){
        prod.setId(id);
        return repository.save(prod);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id){
        repository.deleteById(id);
    }

}
