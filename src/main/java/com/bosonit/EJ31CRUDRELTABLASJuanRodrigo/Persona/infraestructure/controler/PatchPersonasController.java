package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.controler;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.application.PersonaService;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.controler.input.PersonaInputDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatchPersonasController {

    @Autowired
    PersonaService personaService;

    @PatchMapping("/user/id/{idPersona}")
    public ResponseEntity<String> updateUser(@RequestBody PersonaInputDTO personaInputDTO, @PathVariable String idPersona){

        try {
            personaService.updateUsername(personaInputDTO, idPersona);
            return new ResponseEntity<>("Nombre usuario actualizado correctamente. Nuevo nombre: " + personaInputDTO.getUsername(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Error al modificar, el usuario debe tener entre 6 y 10 caracteres.", HttpStatus.UNPROCESSABLE_ENTITY);
        }


    }

}
