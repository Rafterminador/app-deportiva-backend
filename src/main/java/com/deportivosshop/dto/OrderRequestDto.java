package com.deportivosshop.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderRequestDto {
    private Integer userId;
    private BigDecimal discount;
    private List<OrderItemRequestDto> items;
}