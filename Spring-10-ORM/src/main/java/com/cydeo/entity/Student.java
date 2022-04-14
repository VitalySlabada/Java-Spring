package com.cydeo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private long id;
    private String firstName; //first_name in table
    private String lastName;
    private String email;
}
