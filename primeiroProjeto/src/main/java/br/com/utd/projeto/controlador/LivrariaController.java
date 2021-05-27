package br.com.utd.projeto.controlador;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.utd.projeto.entidades.Livro;
import br.com.utd.projeto.service.LivroService;

@Controller
public class LivrariaController {

	@Autowired
	LivroService servico;
	
	@RequestMapping("/")
	public String paginaInicial(Model modelo, Model entidade) {
	
		Livro livro = new Livro();
		
		List<Livro> livros = servico.listarLivros();
		
		for(Livro l : livros) {
			System.out.println(l.getTitulo());
		}
		//Mostrando o ID na ordem crescente.
		livros.sort(Comparator.comparingLong(Livro::getId));
		
		modelo.addAttribute("livros", livros);
		
		Livro novo = new Livro();
		
		entidade.addAttribute("livro", novo);
		
		return "index";
	}
	
	@RequestMapping("/cadastro")
	public String paginaCadastro(Model model) {
		
		Livro livro = new Livro();
		
		model.addAttribute("livro", livro);
		
		return "cadastrarlivro";
	}
	
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public String salvar(@ModelAttribute("livro")Livro livro) {
		
		servico.adicionar(livro);
		return "redirect:/";
	}
	
	@RequestMapping("/editar/{id}")
	public ModelAndView paginaEditar(@PathVariable(name="id") long id) {
		
		ModelAndView mav = new ModelAndView("editarlivro");
		
		Livro livro =  servico.modificar(id);
		
		mav.addObject("livro", livro);
		
		
		return mav;		
	}
	
	@RequestMapping("/deletar/{id}")
	public String deletar(@PathVariable(name="id") long id) {
		servico.deletar(id);
		
		return "redirect:/";
	}
	
	
	
	
}
