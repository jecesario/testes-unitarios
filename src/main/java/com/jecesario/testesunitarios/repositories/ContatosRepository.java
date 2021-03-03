package com.jecesario.testesunitarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jecesario.testesunitarios.models.Contatos;

public interface ContatosRepository extends JpaRepository<Contatos, Long> {
	
}
