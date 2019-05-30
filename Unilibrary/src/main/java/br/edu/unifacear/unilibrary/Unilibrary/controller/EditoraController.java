package br.edu.unifacear.unilibrary.Unilibrary.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifacear.unilibrary.Unilibrary.model.entity.Editora;
import br.edu.unifacear.unilibrary.Unilibrary.model.repository.EditoraRepository;

@RestController
public class EditoraController {
	private final EditoraRepository editoraRep;
	
	EditoraController(EditoraRepository editoraRep) {
		this.editoraRep = editoraRep;
	}
	
	@PostMapping("/unilibrary/editora/inserir")
	public void inserir(@RequestBody Editora e) {
		this.editoraRep.save(e);
	}
	
	@GetMapping("/unilobrary/editora/listar")
	public List<Editora> listar() {
		return this.editoraRep.findAll();
	}
}
