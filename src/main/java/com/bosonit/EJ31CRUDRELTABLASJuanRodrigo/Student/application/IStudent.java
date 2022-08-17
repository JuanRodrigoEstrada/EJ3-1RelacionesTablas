package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.application;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.input.StudentInputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.output.StudentOutputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.output.StudentPersonaOutputDTO;


import java.util.List;

public interface IStudent {

   List<StudentOutputDTO> getALlStudents();

   StudentOutputDTO createStudent(StudentInputDTO studentInputDTO);
   StudentOutputDTO getStudentById(String idStudent) throws Exception;

   StudentPersonaOutputDTO getStudentPersona(String idStudent) throws Exception;

   StudentOutputDTO updateStudent(StudentInputDTO studentInputDTO, String idStudent);
}
