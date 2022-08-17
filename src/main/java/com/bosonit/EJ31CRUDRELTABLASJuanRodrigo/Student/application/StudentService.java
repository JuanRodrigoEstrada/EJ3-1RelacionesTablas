package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.application;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.controler.output.PersonaOutputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.infraestructure.repository.PersonaRepository;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.domain.Student;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.input.StudentInputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.output.StudentOutputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.output.StudentPersonaOutputDTO;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements IStudent{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    PersonaRepository personaRepository;

    public List<StudentOutputDTO> getALlStudents(){
        List<Student> students = studentRepository.findAll();
        List<StudentOutputDTO> studentOutputDTO = new ArrayList<>();
        for (Student s:students){
            StudentOutputDTO student = new StudentOutputDTO(s);
            studentOutputDTO.add(student);
        }
        return studentOutputDTO;
    }

    public StudentOutputDTO createStudent(StudentInputDTO studentInputDTO){
        Student student = new Student(studentInputDTO);
        StudentOutputDTO studentOutputDTO = new StudentOutputDTO(student);
        studentRepository.save(student);
        return studentOutputDTO;
    }

    public StudentOutputDTO getStudentById(String idStudent)throws Exception{
        if (studentRepository.getStudentByIdStudent(idStudent) != null){
            return studentRepository.getStudentByIdStudent(idStudent);
        }else {
            throw new  Exception();
        }
    }

    public StudentPersonaOutputDTO getStudentPersona(String idStudent) throws Exception{

        if (studentRepository.getStudentByIdStudent(idStudent)!=null){
            PersonaOutputDTO personaOutputDTO = personaRepository.findByIdPersona(idStudent);
            StudentOutputDTO studentOutputDTO = studentRepository.getStudentByIdStudent(idStudent);
            StudentPersonaOutputDTO studentPersonaOutputDTO = new StudentPersonaOutputDTO(personaOutputDTO, studentOutputDTO);
            return studentPersonaOutputDTO;
        }else {
            throw new Exception();
        }
    }

    public StudentOutputDTO deleteStudentById(String idStudent) throws Exception{
        if (studentRepository.getStudentByIdStudent(idStudent) == null){
            throw new Exception();
        }else {
            List<Student> students = studentRepository.findAll();
            StudentOutputDTO studentOutputDTO = studentRepository.getStudentByIdStudent(idStudent);

            for (Student s:students){
                if (s.getIdStudent().equals(idStudent)){
                    studentRepository.delete(s);
                }
            }
            return studentOutputDTO;
        }
    }

    public StudentOutputDTO updateStudent(StudentInputDTO studentInputDTO, String idStudent){
        StudentOutputDTO studentOutputDTO = studentRepository.getStudentByIdStudent(idStudent);
        List<Student> students = studentRepository.findAll();
        for (Student s:students){
            if (s.getIdStudent().equals(idStudent)){
                if (studentInputDTO.getBranch() != null){
                    studentOutputDTO.setBranch(studentInputDTO.getBranch());
                    s.setBranch(studentInputDTO.getBranch());
                }
                if (studentInputDTO.getComments() != null){
                    studentOutputDTO.setComments(studentInputDTO.getComments());
                    s.setComments(studentInputDTO.getComments());
                }
                if (studentInputDTO.getNumHoursWeek() != 0){
                    studentOutputDTO.setNumHoursWeek(studentInputDTO.getNumHoursWeek());
                    s.setNumHoursWeek(studentInputDTO.getNumHoursWeek());
                }
                studentRepository.save(s);
            }
        }
        return studentOutputDTO;
    }

}
