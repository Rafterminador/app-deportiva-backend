package com.deportivosshop.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemRequestDto {
    private Integer productId;
    private Integer quantity;
    private BigDecimal unitPrice;
}