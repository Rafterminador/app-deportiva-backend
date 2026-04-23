package com.deportivosshop.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderResponseDto {
    private Integer id;
    private String orderNumber;
    private String user;
    private String status;
    private BigDecimal subtotal;
    private BigDecimal discount;
    private BigDecimal total;
    private List<OrderItemResponseDto> items;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}