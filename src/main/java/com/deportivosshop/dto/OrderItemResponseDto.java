package com.deportivosshop.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemResponseDto {
    private Integer id;
    private String product;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal subtotal;
}