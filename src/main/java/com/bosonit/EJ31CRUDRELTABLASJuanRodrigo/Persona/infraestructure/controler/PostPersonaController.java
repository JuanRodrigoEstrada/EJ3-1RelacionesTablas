package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.controler;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.application.PersonaService;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.controler.input.PersonaInputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.controler.output.PersonaOutputDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class PostPersonaController {

    @Autowired
    PersonaService personaService;

    @PostMapping("/user")
    public ResponseEntity<Object> createUser(@RequestBody PersonaInputDTO personaInputDTO){
        try {
            PersonaOutputDTO personaOutputDTOPost = personaService.createUser(personaInputDTO);
            return new ResponseEntity<>(personaOutputDTOPost, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>("El nombre de usuario debe tener entre 6 y 10 caracteres.", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

}
