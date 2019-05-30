package br.edu.unifacear.unilibrary.Unilibrary.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifacear.unilibrary.Unilibrary.model.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
