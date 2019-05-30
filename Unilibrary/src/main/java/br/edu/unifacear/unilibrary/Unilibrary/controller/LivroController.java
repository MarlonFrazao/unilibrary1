package br.edu.unifacear.unilibrary.Unilibrary.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifacear.unilibrary.Unilibrary.model.entity.Livro;
import br.edu.unifacear.unilibrary.Unilibrary.model.repository.LivroRepository;

@RestController
public class LivroController {
	private final LivroRepository livroRep;
	
	LivroController(LivroRepository livroRep) {
		this.livroRep = livroRep;
	}
	
	@PostMapping("/unilibrary/livro/inserir")
	public void inserir(@RequestBody Livro l) {
		this.livroRep.save(l);
	}
	
	@GetMapping("/unilibrary/livro/listar")
	public List<Livro> listar() {
		return this.livroRep.findAll();
	}
	
	@GetMapping("/unilibrary/livro/obter")
	public Livro obter(@RequestParam("id") Integer id) {
		return this.livroRep.getOne(id);
	}
}
