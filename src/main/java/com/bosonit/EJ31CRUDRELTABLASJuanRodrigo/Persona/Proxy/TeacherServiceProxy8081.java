package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.Proxy;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Profesor.infraestructure.controller.output.ProfesorOutputDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "port8081", url = "http://localhost:8081/Profesor/1")

public interface TeacherServiceProxy8081 {
    @GetMapping("{id}")
    ResponseEntity<?> getProfesor8081(@PathVariable int id);
}

