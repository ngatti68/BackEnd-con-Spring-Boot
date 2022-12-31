package com.api.backend.repository;

import com.api.backend.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepo extends JpaRepository<Skills, Long> {
}
