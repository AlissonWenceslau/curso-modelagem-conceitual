package com.alissw.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissw.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
