package com.cydeo.controller;

import com.cydeo.entity.Student;
import com.cydeo.service.StudentService;
import net.minidev.json.JSONArray;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest     //use when no beans needed
class StudentControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean   //to mock student service bean
    StudentService studentService;

    @Test
    void getStudent() throws Exception {

        mvc.perform(MockMvcRequestBuilders
                        .get("/student")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\": 0, \"firstName\": \"Mike\", \"lastName\": \"Smith\", \"age\": 20}"))
                .andReturn();

    }

    //will compare two JSONs , if not strict - does not have to include all
    @Test
    void jsonAssert() throws JSONException {
        String expected = "{\"id\": 0, \"firstName\": \"Mike\", \"lastName\": \"Smith\"}";
        String actual = "{\"id\": 0, \"firstName\": \"Mike\", \"lastName\": \"Smith\", \"age\": 20}";

        JSONAssert.assertEquals(expected, actual, false);
    }

    @Test
    void getStudent_service() throws Exception {

        when(studentService.getStudent()).thenReturn(Arrays.asList(
                new Student("John", "Doe", 20),
                new Student("Tom", "Hanks", 50)
        ));

        mvc.perform(MockMvcRequestBuilders
                        .get("/service/student")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[{\"id\": 0, \"firstName\": \"John\", \"lastName\": \"Doe\", \"age\": 20},{\"id\": 0, \"firstName\": \"Tom\", \"lastName\": \"Hanks\", \"age\": 50}]"))
                .andReturn();
    }

}