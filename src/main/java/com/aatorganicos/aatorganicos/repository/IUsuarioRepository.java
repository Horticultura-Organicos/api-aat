package com.aatorganicos.aatorganicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aatorganicos.aatorganicos.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
