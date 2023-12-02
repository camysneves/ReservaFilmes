package com.br.reservafilme.repository;


import com.br.reservafilme.entity.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator, Long> {
}
