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
public class AftHighSpeedTestDTO implements Serializable {
    private String stockCode;
    private String stockName;
    private String tradeDate;
    private String tradeTime;
    private BigDecimal morRate;
    private int slipTime;
    private BigDecimal allDayAvgSellPrice;
    private BigDecimal morAvgSellPrice;
    private BigDecimal allDayAvgProfit;
    private BigDecimal morAvgProfit;

}
