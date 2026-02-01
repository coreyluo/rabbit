package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockMarket4UpData 查询参数〉<p>
 *
 * @author
 * @date 2025-03-26
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockMarket4UpDataQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代码
     */
    private String stockCode;

    /**
     * 日期
     */
    private String dateTrade;

    /**
     * 4个点价格
     */
    private BigDecimal highPrice;

    /**
     * 交易时间
     */
    private String timeTrade;

    private Long timeTradeNum;

    /**
     * 行情价
     */
    private BigDecimal latest;

    /**
     * 总成交股数
     */
    private BigDecimal totalVolume;

    /**
     * 总成交额
     */
    private BigDecimal totalAmount;

    /**
     * 均价
     */
    private BigDecimal avgPrice;

    /**
     * 总买金额
     */
    private BigDecimal totalBuyAmount;

    /**
     * 总卖金额
     */
    private BigDecimal totalSellAmount;

    /**
     *  开始
     */
    private Date createTimeFrom;

    /**
     *  结束
     */
    private Date createTimeTo;

    /**
     *  开始
     */
    private Date updateTimeFrom;

    /**
     *  结束
     */
    private Date updateTimeTo;


}