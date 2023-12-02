package com.br.reservafilme.dto;

import com.br.reservafilme.entity.Usuario;
import lombok.Data;

import java.util.List;

@Data
public class AtorDTO {

    private String nomeFilme;
    private Usuario genero;
    private List<ReservaDTO> GeneroDTO;
}
