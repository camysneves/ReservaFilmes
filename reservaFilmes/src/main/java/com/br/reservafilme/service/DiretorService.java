package com.br.reservafilme.service;


import com.br.reservafilme.entity.Diretor;
import com.br.reservafilme.repository.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiretorService {

    @Autowired
    DiretorRepository repository;

    public Diretor create(Diretor diretor) {
        return repository.save(diretor);
    }
}
