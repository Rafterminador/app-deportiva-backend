package com.deportivosshop.dto;

import lombok.Data;

@Data
public class MovementRequestDto {
    private Integer productId;
    private String movementType;
    private Integer amount;
    private String description;
}