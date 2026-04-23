package com.deportivosshop.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UserResponseDto {
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
    private String shippingAddress;
    private String role;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}