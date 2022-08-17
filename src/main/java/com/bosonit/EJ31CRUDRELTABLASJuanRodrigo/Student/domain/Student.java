package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.domain;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Persona.domain.Persona;
import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.SequenceIdGenerator.StringPrefixedSequenceIdGenerator;

import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.input.StudentInputDTO;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students")
    @GenericGenerator(
            name = "students",
            strategy = "com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.SequenceIdGenerator.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),

            }
    )
    private String idStudent;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPersona")
    Persona persona; //Relacion one to one con tabla persona


    private int numHoursWeek;
    private String comments;

    private String idProfesor; // Un estudiante solo puede tener un profesor


    private String branch; // Rama principal estudiante -front, back, fullstack

    public Student(StudentInputDTO studentInputDTO){
        setNumHoursWeek(studentInputDTO.getNumHoursWeek());
        setComments(studentInputDTO.getComments());
        setBranch(studentInputDTO.getBranch());
    }

    public Student(){

    }

}
