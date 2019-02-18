package com.br.codenation.repositories;

import com.br.codenation.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
    Produto findByNome (String nome);
}
