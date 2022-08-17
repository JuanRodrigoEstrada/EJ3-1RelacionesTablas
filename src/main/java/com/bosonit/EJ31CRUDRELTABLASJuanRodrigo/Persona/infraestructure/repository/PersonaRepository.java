package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.repository;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.domain.Persona;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.controler.output.PersonaOutputDTO;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, String> {

    PersonaOutputDTO findByIdPersona(String idPersona);
    PersonaOutputDTO findByUsername(String username);
}
