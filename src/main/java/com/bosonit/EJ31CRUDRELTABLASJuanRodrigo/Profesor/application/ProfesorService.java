package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.application;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.domain.Profesor;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.controller.input.ProfesorInputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.controller.output.ProfesorOutputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.repository.ProfesorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfesorService implements IProfesor{


    @Autowired
    ProfesorRepository profesorRepository;

    public List<ProfesorOutputDTO> getALlProfesores(){
        List<Profesor> profesores = profesorRepository.findAll();
        List<ProfesorOutputDTO> profesorOutputDTOS = new ArrayList<>();
        for (Profesor p : profesores){
            ProfesorOutputDTO profesorDTO = new ProfesorOutputDTO(p);
            profesorOutputDTOS.add(profesorDTO);
        }
    return profesorOutputDTOS;

    }

    public ProfesorOutputDTO createProfesor(ProfesorInputDTO profesorInputDTO){
        Profesor profesor = new Profesor(profesorInputDTO);
        ProfesorOutputDTO profesorOutputDTO = new ProfesorOutputDTO(profesor);
        profesorRepository.save(profesor);
        return profesorOutputDTO;
    }

}
