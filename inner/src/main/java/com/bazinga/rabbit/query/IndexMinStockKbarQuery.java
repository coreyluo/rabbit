package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈IndexMinStockKbar 查询参数〉<p>
 *
 * @author
 * @date 2023-10-15
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class IndexMinStockKbarQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 股票代码
     */
    private String stockCode;

    /**
     * 股票名称
     */
    private String stockName;

    /**
     * 交易日期
     */
    private String kbarDate;

    /**
     * 时间
     */
    private String kbarTime;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    /**
     * 开盘价
     */
    private BigDecimal openPrice;

    /**
     * 收盘价
     */
    private BigDecimal closePrice;

    /**
     * 最高价
     */
    private BigDecimal highPrice;

    /**
     * 最低价
     */
    private BigDecimal lowPrice;

    /**
     * 开盘价
     */
    private BigDecimal adjOpenPrice;

    /**
     * 收盘价
     */
    private BigDecimal adjClosePrice;

    /**
     * 最高价
     */
    private BigDecimal adjHighPrice;

    /**
     * 最低价
     */
    private BigDecimal adjLowPrice;

    /**
     * 
     */
    private BigDecimal aftAdjOpenPrice;

    /**
     * 
     */
    private BigDecimal aftAdjClosePrice;

    /**
     * 
     */
    private BigDecimal aftAdjHighPrice;

    /**
     * 
     */
    private BigDecimal aftAdjLowPrice;

    /**
     * 复权因子
     */
    private BigDecimal adjFactor;

    /**
     * 1 一分钟k线 10 十分钟k线
     */
    private Integer kbarType;

    /**
     * 成交数量(单位手)
     */
    private Long tradeQuantity;

    /**
     * 成交额
     */
    private BigDecimal tradeAmount;

    /**
     * 
     */
    private BigDecimal emaShort;

    /**
     * 
     */
    private BigDecimal emaLong;

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
    private BigDecimal dea;

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