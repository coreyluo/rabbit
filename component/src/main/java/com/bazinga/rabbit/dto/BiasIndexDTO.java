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
public class BiasIndexDTO implements Serializable {
    private String stockCode;
    private String tradeDate;
    private BigDecimal bias6;
    private BigDecimal bias12;
    private BigDecimal bias24;
}
