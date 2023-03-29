package com.bazinga.rabbit.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class StockOperateDTO {

    private String stockCode;

    private BigDecimal weight;

}
