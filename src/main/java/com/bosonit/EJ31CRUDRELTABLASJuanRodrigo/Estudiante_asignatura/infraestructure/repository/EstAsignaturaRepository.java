package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Estudiante_asignatura.infraestructure.repository;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Estudiante_asignatura.domain.EstudianteAsignatura;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Estudiante_asignatura.infraestructure.Controller.output.EstAsignaturaOutputDTO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstAsignaturaRepository extends JpaRepository<EstudianteAsignatura,String> {

    EstAsignaturaOutputDTO findByIdAsignatura(String idAsignatura);
    
}
