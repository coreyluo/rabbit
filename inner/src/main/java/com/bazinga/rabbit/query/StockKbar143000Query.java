package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockKbar143000 查询参数〉<p>
 *
 * @author
 * @date 2024-02-01
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockKbar143000Query extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String tsCode;

    /**
     * 股票名称
     */
    private String stockName;

    /**
     * 
     */
    private Long tradeDate;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    /**
     * 
     */
    private BigDecimal tradeAmount;

    /**
     * 
     */
    private Long tradeQuantity;

    /**
     * 
     */
    private BigDecimal closingPrice14300;

    /**
     * 
     */
    private BigDecimal adjClosingPrice14300;

    /**
     * 
     */
    private BigDecimal macd;

    /**
     * 
     */
    private BigDecimal diff;

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
    private BigDecimal dea;

    /**
     * 创建时间 开始
     */
    private Date createTimeFrom;

    /**
     * 创建时间 结束
     */
    private Date createTimeTo;

    /**
     * 更新时间 开始
     */
    private Date updateTimeFrom;

    /**
     * 更新时间 结束
     */
    private Date updateTimeTo;


}