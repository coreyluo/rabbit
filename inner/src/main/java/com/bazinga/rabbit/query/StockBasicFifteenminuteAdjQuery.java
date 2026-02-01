package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈StockBasicFifteenminuteAdj 查询参数〉<p>
 *
 * @author
 * @date 2023-06-13
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockBasicFifteenminuteAdjQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Long index;

    /**
     * 
     */
    private String tsCode;

    /**
     * 
     */
    private Long tradeDate;

    /**
     * 
     */
    private Long timeTrade;

    /**
     * 
     */
    private BigDecimal preClose;

    /**
     * 
     */
    private BigDecimal valClose;

    /**
     * 
     */
    private BigDecimal valOpen;

    /**
     * 
     */
    private BigDecimal valLow;

    /**
     * 
     */
    private BigDecimal valHigh;

    /**
     * 
     */
    private BigDecimal avgPrice;

    /**
     * 
     */
    private BigDecimal amount;

    /**
     * 
     */
    private Long volume;

    /**
     * 
     */
    private BigDecimal changeRatio;

    /**
     * 
     */
    private BigDecimal adjClose;

    /**
     * 
     */
    private BigDecimal adjOpen;

    /**
     * 
     */
    private BigDecimal adjLow;

    /**
     * 
     */
    private BigDecimal adjHigh;

    /**
     * 
     */
    private BigDecimal diff;

    /**
     * 
     */
    private BigDecimal dea;

    /**
     * 
     */
    private BigDecimal macd;

    /**
     * 
     */
    private BigDecimal bias6;

    /**
     * 
     */
    private BigDecimal bias12;

    /**
     * 
     */
    private BigDecimal bias24;

    /**
     * 
     */
    private BigDecimal ma5;

    /**
     * 
     */
    private BigDecimal ma10;

    /**
     * 
     */
    private BigDecimal ma20;

    /**
     * 
     */
    private BigDecimal ma30;

    /**
     * 
     */
    private BigDecimal ma60;


}