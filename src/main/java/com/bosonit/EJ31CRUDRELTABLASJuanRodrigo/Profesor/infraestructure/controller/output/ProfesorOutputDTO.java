package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.controller.output;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.domain.Profesor;

import lombok.Data;


@Data
public class ProfesorOutputDTO {

    private String idProfesor;
    private String comments;
    private String branch;

    public ProfesorOutputDTO(Profesor profesor){

        setIdProfesor(profesor.getIdProfesor());
        setBranch(profesor.getBranch());
        setComments(profesor.getComments());

    }

}
