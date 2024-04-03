package com.example.demo.controller;

import com.example.demo.model.Produs;
import com.example.demo.repository.ProdusRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produse")
public class ProdusController {

    private final ProdusRepository produsRepository;

    public ProdusController(ProdusRepository produsRepository) {
        this.produsRepository = produsRepository;
    }

    @GetMapping
    public List<Produs> getAllProduse() {
        return produsRepository.findAll();
    }
}
