package com.example.controllers.dirtbikePKG;

import com.example.enums.Color;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dirtbike {
    private String make;
    private String country;
    private Color color;
}
