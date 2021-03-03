package com.jecesario.testesunitarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jecesario.testesunitarios.models.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
	
}
