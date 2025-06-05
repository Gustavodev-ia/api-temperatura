package com.example.demo.repository;

import com.example.demo.model.Clima;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClimaRepository extends JpaRepository<Clima, Long> {
}
