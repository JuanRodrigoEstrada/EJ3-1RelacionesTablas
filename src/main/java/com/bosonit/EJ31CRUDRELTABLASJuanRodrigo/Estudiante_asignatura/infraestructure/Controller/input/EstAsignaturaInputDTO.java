package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Estudiante_asignatura.infraestructure.Controller.input;

import lombok.Data;

import java.util.Date;

@Data
public class EstAsignaturaInputDTO {


    private String asignatura;
    private String comments;
    private Date initialDate;
    private Date finishDate;
    private String idStudent;

    public EstAsignaturaInputDTO(){

    }

}
