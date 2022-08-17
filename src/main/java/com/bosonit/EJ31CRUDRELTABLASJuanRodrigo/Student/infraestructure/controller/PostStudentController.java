package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller;


import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.application.StudentService;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.input.StudentInputDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostStudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<Object> createStudent(@RequestBody StudentInputDTO studentInputDTO){
        try {
           studentService.createStudent(studentInputDTO);
           return new ResponseEntity<>("Estudiante creado correctamente", HttpStatus.UNPROCESSABLE_ENTITY);
        }catch (Exception e){
            return new ResponseEntity<>("Error al crear estudiante", HttpStatus.UNPROCESSABLE_ENTITY);
        }

    }

}
