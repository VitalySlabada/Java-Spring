package com.example.spring08springmvcmodel.model;
//class is not dependency - no need for @ component

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Student {
    private int id;
    private String firstName;
    private String lastName;


}
