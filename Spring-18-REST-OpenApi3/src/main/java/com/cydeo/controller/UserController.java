package com.cydeo.controller;

import com.cydeo.entity.User;
import com.cydeo.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    @Operation(summary = " read all users")
    //empty content if no response needed
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successfully retrieved items", content = {@Content (mediaType = "application/json")}),
            @ApiResponse(responseCode = "202", description = "successfully retrieved items",content = @Content ),
            @ApiResponse(responseCode = "400", description = "Not found", content = @Content)
    })
    public List<User> readAllUsers() {
        return userRepository.findAll();
    }

}
