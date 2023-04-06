package com.backendMarch.librarymanagementsystem.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor

@Setter
public class StudentUpdateEmailRequestDto {
    private int id;

    private String email;

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
