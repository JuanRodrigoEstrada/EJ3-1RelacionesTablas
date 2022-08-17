package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.repository;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.domain.Student;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.output.StudentOutputDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    StudentOutputDTO getStudentByIdStudent(String idStudent);


}
