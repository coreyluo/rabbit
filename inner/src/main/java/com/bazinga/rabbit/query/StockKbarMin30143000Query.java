package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockKbarMin30143000 查询参数〉<p>
 *
 * @author
 * @date 2024-03-03
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockKbarMin30143000Query extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String stockCode;

    /**
     * 
     */
    private BigDecimal tradeAmount;

    /**
     * 
     */
    private BigDecimal tradeVolume;

    /**
     * 
     */
    private BigDecimal closePrice;

    /**
     * 
     */
    private BigDecimal openPrice;

    /**
     * 
     */
    private BigDecimal highPrice;

    /**
     * 
     */
    private BigDecimal lowPrice;

    private BigDecimal macd;
    private BigDecimal diff;
    private BigDecimal dea;
    private BigDecimal bias6;
    private BigDecimal bias12;
    private BigDecimal bias24;

    /**
     * 
     */
    private Long tradeDate;

    /**
     * 创建时间 开始
     */
    private Date createTimeFrom;

    /**
     * 创建时间 结束
     */
    private Date createTimeTo;


}