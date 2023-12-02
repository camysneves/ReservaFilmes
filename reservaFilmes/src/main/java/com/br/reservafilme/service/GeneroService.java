package com.br.reservafilme.service;

import com.br.reservafilme.entity.Filme;
import com.br.reservafilme.entity.Genero;
import com.br.reservafilme.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

// ... (imports and annotations)

@Service
public class GeneroService {

    @Autowired
    GeneroRepository repository;

    public Genero create(Genero generoFilme) {
        generoFilme.setStatus("reservado");
        return repository.save(generoFilme);
    }

    public void selecionarFilme(Long selecionarFilmeId) throws Exception {
        Optional<Genero> filmeToUpdate = repository.findById(selecionarFilmeId);

        if (filmeToUpdate.isPresent()) {
            Genero generoToUpdate = filmeToUpdate.get();
            if (Objects.equals(generoToUpdate.getStatus(), "reservado")) {
                generoToUpdate.setStatus("Deferido");
                repository.save(generoToUpdate);
            } else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Só é possível deferir com status reservado.");
            }
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Dados não encontrados.");
        }
    }

    public Double retornaMediaFilme() {
        return repository.retornaMedia();
    }

    public List<Filme> retornaFilmesPorStatus(String status) {
        return repository.retornaFilmes(status);
    }
}
