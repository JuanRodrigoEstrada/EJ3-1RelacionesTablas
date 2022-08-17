package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.Proxy;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.controller.output.ProfesorOutputDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

    @FeignClient(name="port8080", url = "http://localhost:8080/Persona/Profesor/")
    public interface TeacherServiceProxy {
        @GetMapping("{id}")
        ResponseEntity<?> getProfesor8080(@PathVariable int id);
    }

