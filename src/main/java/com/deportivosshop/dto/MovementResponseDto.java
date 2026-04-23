package com.deportivosshop.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MovementResponseDto {
    private Integer id;
    private String product;
    private String movementType;
    private Integer amount;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}