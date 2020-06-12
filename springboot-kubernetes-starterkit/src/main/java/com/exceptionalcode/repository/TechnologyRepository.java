package com.exceptionalcode.repository;

import com.exceptionalcode.model.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyRepository extends JpaRepository<Technology, String> {
}
