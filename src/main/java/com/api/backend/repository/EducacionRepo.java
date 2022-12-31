package com.api.backend.repository;

import com.api.backend.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacionRepo extends JpaRepository<Educacion, Long> {
}
