package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Estudiante_asignatura.application;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Estudiante_asignatura.infraestructure.Controller.input.EstAsignaturaInputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Estudiante_asignatura.infraestructure.Controller.output.EstAsignaturaOutputDTO;


import java.util.List;

public interface IEstAsignatura {

    List<EstAsignaturaOutputDTO> getAllAsignaturas();

    EstAsignaturaOutputDTO createAsignatura(EstAsignaturaInputDTO estAsignaturaInputDTO);

    List<EstAsignaturaOutputDTO> getEstAsignaturaById(String idAsignatura) throws Exception;

    EstAsignaturaOutputDTO deleteAsignatura(String idAsignatura) throws Exception;

    EstAsignaturaOutputDTO updateEstudianteAsignatura(EstAsignaturaInputDTO estAsignaturaInputDTO, String idAsignatura);


}
