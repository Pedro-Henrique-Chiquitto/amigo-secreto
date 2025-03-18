package com.example.amigosecreto.service;

import com.example.amigosecreto.model.Amigo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class AmigoService {
    private final List<Amigo> amigos = new ArrayList<>();

    public void adicionarAmigo(String nome) {
        amigos.add(new Amigo(nome));
    }

    public List<Amigo> getAmigos() {
        return amigos;
    }

    public List<String> sortear() {
        if (amigos.size() < 2) {
            throw new IllegalStateException("É necessário pelo menos 2 amigos para o sorteio.");
        }

        List<Amigo> sorteio = new ArrayList<>(amigos);
        Collections.shuffle(sorteio);

        List<String> resultado = new ArrayList<>();
        for (int i = 0; i < sorteio.size(); i++) {
            Amigo amigo = sorteio.get(i);
            Amigo amigoSecreto = sorteio.get((i + 1) % sorteio.size());
            resultado.add(amigo.getNome() + " → " + amigoSecreto.getNome());
        }
        return resultado;
    }
}
