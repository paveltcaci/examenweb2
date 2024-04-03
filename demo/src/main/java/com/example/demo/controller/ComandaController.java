package com.example.demo.controller;

import com.example.demo.model.Comanda;
import com.example.demo.repository.ComandaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comenzi")
public class ComandaController {

    private final ComandaRepository comandaRepository;

    public ComandaController(ComandaRepository comandaRepository) {
        this.comandaRepository = comandaRepository;
    }

    @GetMapping
    public List<Comanda> getAllComenzi() {
        return comandaRepository.findAll();
    }

    @PostMapping
    public Comanda createComanda(@RequestBody Comanda comanda) {
        return comandaRepository.save(comanda);
    }
}
