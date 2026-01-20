package com.bazinga.rabbit.dto;

import lombok.Data;

import java.math.BigDecimal;


/**
 * @author yunshan
 * @date 2019/5/13
 */
@Data
public class ChuangXinYaoTestDTO {
    private String StockCode;
    private String StockName;
    private String tradeDate;
    private BigDecimal rateDay1;
    private BigDecimal rateDay3;
    private BigDecimal rateDay5;
    private BigDecimal rateDay10;
    private String buyTime;
    private String planks;
    private BigDecimal profit;
}
