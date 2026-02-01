package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈HistoryStock143000 查询参数〉<p>
 *
 * @author
 * @date 2024-02-01
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class HistoryStock143000Query extends PagingQuery implements Serializable {

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
     * 交易时间
     */
    private String kbarDate;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    /**
     * 成交量
     */
    private BigDecimal totalVolume;

    /**
     * 成交额
     */
    private BigDecimal totalAmount;

    /**
     * 开盘价
     */
    private BigDecimal valOpen;

    /**
     * 最高价
     */
    private BigDecimal valHigh;

    /**
     * 最低价
     */
    private BigDecimal valLow;

    /**
     * 当前价
     */
    private BigDecimal valLatest;

    private BigDecimal rateDay3;
    private BigDecimal rateDay5;
    private BigDecimal rateDay10;
    private BigDecimal rateDay15;
    private BigDecimal rateDay30;
    private BigDecimal turnRatio;
    private BigDecimal realMarketValue;

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