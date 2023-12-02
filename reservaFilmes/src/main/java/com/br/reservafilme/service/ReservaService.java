package com.br.reservafilme.service;

import com.br.reservafilme.entity.Reserva;
import com.br.reservafilme.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    ReservaRepository repository;

    public Reserva create(Reserva reserva) {
        return repository.save(reserva);
    }

    public List<Reserva> getByGeneroId(Long generoId) {
        return repository.findByGeneroId(generoId);
    }
}
