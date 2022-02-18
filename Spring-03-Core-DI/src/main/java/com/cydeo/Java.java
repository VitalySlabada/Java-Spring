package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@AllArgsConstructor
@Component
public class Java {

//    //field injection
//    @Autowired
//    OfficeHours officeHours;




    OfficeHours officeHours;
    //COnstructor injection - not needed in only one constructor
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){

        System.out.println("weekly teaching hours:" + (60 + officeHours.getHours()));

    }
}
