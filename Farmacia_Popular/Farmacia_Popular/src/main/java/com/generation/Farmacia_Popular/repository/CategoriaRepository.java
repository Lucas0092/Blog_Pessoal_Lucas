package com.generation.Farmacia_Popular.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.Farmacia_Popular.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
	
	public List<Categoria> findAllByMarcaContainingIgnoreCase(String marca);
}
