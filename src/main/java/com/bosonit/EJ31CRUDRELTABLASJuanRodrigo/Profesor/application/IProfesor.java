package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.application;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.controller.input.ProfesorInputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.controller.output.ProfesorOutputDTO;


import java.util.List;

public interface IProfesor {

    List<ProfesorOutputDTO> getALlProfesores();
    ProfesorOutputDTO createProfesor(ProfesorInputDTO profesorInputDTO);

}
