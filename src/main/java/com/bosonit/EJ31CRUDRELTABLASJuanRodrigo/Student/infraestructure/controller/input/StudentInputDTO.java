package com.bosonit.EJ31CRUDRELTABLASJuanRodrigo.Student.infraestructure.controller.input;


import lombok.Data;

@Data
public class StudentInputDTO {
    private int numHoursWeek;
    private String comments;
    private String branch;
    private String idStudent;

    public StudentInputDTO(){

    }
}
