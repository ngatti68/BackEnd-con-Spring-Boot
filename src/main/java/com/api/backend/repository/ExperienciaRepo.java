package com.api.backend.repository;

import com.api.backend.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ExperienciaRepo extends JpaRepository<Experiencia, Long>, JpaSpecificationExecutor<Experiencia> {
}
