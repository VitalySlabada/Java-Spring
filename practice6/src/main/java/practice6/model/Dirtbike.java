package practice6.model;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import practice6.enums.Color;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dirtbike {
    private String make;
    private String country;
    private Color color;
}
