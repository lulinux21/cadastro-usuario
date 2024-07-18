package com.inovaxr.cadastro_usuarios.repository;

import com.inovaxr.cadastro_usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}