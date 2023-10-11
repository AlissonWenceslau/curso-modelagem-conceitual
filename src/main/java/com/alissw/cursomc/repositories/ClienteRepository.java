package com.alissw.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissw.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
