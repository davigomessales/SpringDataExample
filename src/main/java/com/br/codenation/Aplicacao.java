package com.br.codenation;

import com.br.codenation.models.Produto;
import com.br.codenation.repositories.ProdutoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Aplicacao {
    public static void main(String[] args){
        SpringApplication.run(Aplicacao.class, args);
    }

    @Bean
    public String exemplo (ProdutoRepository repositorio){
        System.out.println("Cadastrando Produtos...");

        repositorio.save(new Produto("Sabonete", 10, 1.35));
        repositorio.save(new Produto( "Lampada", 35, 7.50));
        repositorio.save(new Produto( "Impressora", 20, 350.00));
        repositorio.save(new Produto("Computador", 10, 2500.00));
        System.out.println("-----------------------------------");

        return "";
    }
}
