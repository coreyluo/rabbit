package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockProfitInfo 查询参数〉<p>
 *
 * @author
 * @date 2026-01-12
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockProfitInfoQuery extends PagingQuery implements Serializable {

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
     * 开盘买次日开盘卖
     */
    private BigDecimal openSellOpen;

    /**
     * 开盘买次日均价卖
     */
    private BigDecimal openSellAvg;

    /**
     * 开盘买次日收盘卖
     */
    private BigDecimal openSellEnd;

    /**
     * 收盘买次日开盘卖
     */
    private BigDecimal endSellOpen;

    /**
     * 收盘买次日均价卖
     */
    private BigDecimal endSellAvg;

    /**
     * 收盘买次日收盘卖
     */
    private BigDecimal endSellEnd;

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