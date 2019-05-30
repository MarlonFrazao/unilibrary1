package br.edu.unifacear.unilibrary.Unilibrary.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifacear.unilibrary.Unilibrary.model.entity.Autor;
import br.edu.unifacear.unilibrary.Unilibrary.model.repository.AutorRepository;

@RestController
public class AutorController {
	private final AutorRepository autorRep;
	
	AutorController(AutorRepository autorRep){
		this.autorRep = autorRep;
	}
	
	@PostMapping("/unilibrary/autor/inserir")
	public void inserir(@RequestBody Autor a) {
		this.autorRep.save(a);
	}
	
	@GetMapping("/unilibrary/autor/listar")
	public List<Autor> listar() {
		return this.autorRep.findAll();
	}
	
}
