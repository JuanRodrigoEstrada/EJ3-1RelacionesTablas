package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.domain;


import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.controller.input.ProfesorInputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.SequenceIdGenerator.StringPrefixedSequenceIdGenerator;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "profesores")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profesor")
    @GenericGenerator(
            name = "profesor",
            strategy = "com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.SequenceIdGenerator.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),

            }
    )
    private String idProfesor;

    private String idPersona; // Relacion one to one tabla persona
    private String comments;

    @NotNull
    private String branch; // Asignatura que imparte

    public Profesor(ProfesorInputDTO profesorInputDTO){

        setComments(profesorInputDTO.getComments());
        setBranch(profesorInputDTO.getBranch());

    }

    public Profesor(){

    }

}
