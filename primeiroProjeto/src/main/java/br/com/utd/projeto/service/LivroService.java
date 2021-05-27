package br.com.utd.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.utd.projeto.entidades.Livro;
import br.com.utd.projeto.repositorio.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	LivroRepository repo;
	
	public void adicionar(Livro livro) {
		repo.save(livro);
	}
	
	public List<Livro> listarLivros(){
		return repo.findAll();
	}
	
	public Livro modificar(Long id) {
		return repo.findById(id).get();
	}
	
	public void deletar(Long id) {
		repo.deleteById(id);
	}
	
	
	
}
