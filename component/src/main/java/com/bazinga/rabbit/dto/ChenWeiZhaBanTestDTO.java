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
public class ChenWeiZhaBanTestDTO implements Serializable {
    private String stockCode;
    private String stockName;
    private String tradeDate;
    private BigDecimal endRate;
    private BigDecimal turnRate;
    private BigDecimal rate3;
    private BigDecimal rate5;
    private BigDecimal rate10;
    private BigDecimal rate15;
    private BigDecimal rate30;
    private BigDecimal rate60;
    private BigDecimal profit;

}
