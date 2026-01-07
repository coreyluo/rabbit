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
public class BigBuyOneMinTestDTO implements Serializable {
    private String stockCode;
    private String tradeDate;
    private BigDecimal gatherAmount;
    private BigDecimal totalBigBAmount = BigDecimal.ZERO;
    private Integer times = 0;
    private String buyTimeStr;
}
