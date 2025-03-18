package com.example.amigosecreto.controller;

import com.example.amigosecreto.service.AmigoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/amigos")
@CrossOrigin("*") // Permitir requisições do frontend
public class AmigoController {
    private final AmigoService amigoService;

    public AmigoController(AmigoService amigoService) {
        this.amigoService = amigoService;
    }

    @PostMapping("/adicionar")
    public void adicionarAmigo(@RequestParam String nome) {
        amigoService.adicionarAmigo(nome);
    }

    @GetMapping
    public List<String> listarAmigos() {
        return amigoService.getAmigos().stream().map(a -> a.getNome()).toList();
    }

    @GetMapping("/sortear")
    public List<String> sortear() {
        return amigoService.sortear();
    }
}
