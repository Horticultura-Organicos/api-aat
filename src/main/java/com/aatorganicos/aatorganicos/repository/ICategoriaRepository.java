package com.aatorganicos.aatorganicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aatorganicos.aatorganicos.model.Categoria;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
