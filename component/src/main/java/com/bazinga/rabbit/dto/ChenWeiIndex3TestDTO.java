package com.bazinga.rabbit.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈CirculateInfo〉<p>
 *
 * @author
 * @date 2021-05-10
 */
@lombok.Data
@lombok.ToString
public class ChenWeiIndex3TestDTO implements Serializable {
    private String stockCode;
    private String stockName;
    private String tradeDate;
    private Integer beforeFlag;
    private BigDecimal openRate;
    private BigDecimal index3;
    private BigDecimal rate3;
    private BigDecimal rate5;
    private BigDecimal rate10;
    private BigDecimal rate15;
    private BigDecimal rate30;
    private BigDecimal rate60;
    private Integer plankFlag;
    private BigDecimal profit;
    private BigDecimal highBuyProfit;

}
