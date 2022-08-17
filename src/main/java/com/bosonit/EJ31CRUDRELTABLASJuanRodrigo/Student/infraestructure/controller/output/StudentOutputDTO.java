package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.output;


import com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.domain.Student;

import lombok.Data;

@Data
public class StudentOutputDTO {

    private String idStudent;
    private int numHoursWeek;
    private String comments;
    private String branch;

    public StudentOutputDTO(Student student){
        setIdStudent(student.getIdStudent());
        setNumHoursWeek(student.getNumHoursWeek());
        setComments(student.getComments());
        setBranch(student.getBranch());
    }

    public StudentOutputDTO(){

    }

}
