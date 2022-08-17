package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.controller.input;


import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.domain.Persona;

import lombok.Data;

@Data
public class ProfesorInputDTO {

    private String comments;
    private String branch;
    private Persona persona;

}
