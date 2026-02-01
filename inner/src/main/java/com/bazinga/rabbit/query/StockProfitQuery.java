package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockProfit 查询参数〉<p>
 *
 * @author
 * @date 2023-12-12
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockProfitQuery extends PagingQuery implements Serializable {

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
     * 收盘买次日收盘卖
     */
    private BigDecimal endSellEnd1;

    /**
     * 收盘卖两日收盘卖出
     */
    private BigDecimal endSellEnd2;

    private BigDecimal rateDay3;

    /**
     * 5日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay5;

    /**
     * 10日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay10;

    /**
     * 20日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay20;

    private BigDecimal profitAvg1;
    private Integer planks;
    private Integer marketType;

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