package com.Crestfield_Academy.Crestfield_Academy_Backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDto {
    private int id;
    private String name;
    private String address;
    private String phone;
    private int age;
    private String email;
}
