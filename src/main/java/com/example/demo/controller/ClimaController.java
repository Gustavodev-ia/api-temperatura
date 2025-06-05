package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Clima;
import com.example.demo.repository.ClimaRepository;
import com.example.demo.service.IaService;

import java.util.List;

@RestController
@RequestMapping("/clima")
@CrossOrigin("*") // Permitir requisição do Arduino/HTML
public class ClimaController {

    private final ClimaRepository repo;
    private final IaService ia;


    public ClimaController(ClimaRepository repo, IaService ia) {
        this.repo = repo;
        this.ia = ia;
    }

    @PostMapping("/analisar")
    public String analisar(@RequestBody Clima clima) {
        repo.save(clima);
        return ia.analisar(clima);
    }

    @GetMapping
    public List<Clima> listar() {
        return repo.findAll();
    }
}
