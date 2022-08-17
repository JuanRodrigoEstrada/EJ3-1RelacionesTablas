package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.application;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.controler.input.PersonaInputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.controler.output.PersonaOutputDTO;


import java.util.List;

public interface IPersona {

    PersonaOutputDTO createUser(PersonaInputDTO personaInputDTO) throws Exception;
    PersonaOutputDTO getUserByID(String idPersona) throws Exception;

    PersonaOutputDTO findByUsername(String username) throws Exception;
    List<PersonaOutputDTO> getALlPersonas();
    PersonaOutputDTO deleteUser(String idPersona) throws Exception;
    PersonaOutputDTO updateUsername(PersonaInputDTO personaInputDTO, String idPersona) throws Exception;
}
