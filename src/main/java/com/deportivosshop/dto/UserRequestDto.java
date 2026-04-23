package com.deportivosshop.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserRequestDto {
    private String name;
    private String surname;
    private String email;
    private String password;
    private LocalDate dateOfBirth;
    private String shippingAddress;
    private Integer roleId;
}