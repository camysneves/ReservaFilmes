package com.br.reservafilme.repository;

import com.br.reservafilme.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    public List<Reserva> findByReservaId(Long generoId);
}
