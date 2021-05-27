package br.com.utd.projeto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.utd.projeto.entidades.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	
	
}
