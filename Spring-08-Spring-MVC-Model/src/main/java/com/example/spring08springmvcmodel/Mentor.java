package com.example.spring08springmvcmodel;

import com.example.spring08springmvcmodel.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {
    private String firstName;
    private String lastName;
    private int age;
    Gender gender;


}
