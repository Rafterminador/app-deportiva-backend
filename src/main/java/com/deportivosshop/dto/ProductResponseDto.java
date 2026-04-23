package com.deportivosshop.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ProductResponseDto {
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private String imgPath;
    private String category;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}