package org.generation.lojagames.repository;

import java.util.List;

import org.generation.lojagames.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
public List<CategoriaModel> findAllByNomeContainingIgnoreCase(String nome);

}
