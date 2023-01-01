package com.api.backend.repository;

import com.api.backend.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>, JpaSpecificationExecutor<Usuario> {

}
