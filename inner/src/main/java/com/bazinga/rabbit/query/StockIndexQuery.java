package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockIndex 查询参数〉<p>
 *
 * @author
 * @date 2022-05-23
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockIndexQuery extends PagingQuery implements Serializable {

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

    private String kbarDateFrom;

    private String kbarDateTo;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    /**
     * macd数值
     */
    private BigDecimal macd;

    /**
     * macd相关diff指标
     */
    private BigDecimal diff;

    /**
     * macd相关dea数值
     */
    private BigDecimal dea;


    private BigDecimal bias6;
    private BigDecimal bias12;
    private BigDecimal bias24;

    private BigDecimal k;
    private BigDecimal d;
    private BigDecimal j;
    private BigDecimal ub;
    private BigDecimal mb;
    private BigDecimal lb;


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