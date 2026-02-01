package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈SweepPlankInfo 查询参数〉<p>
 *
 * @author
 * @date 2024-11-06
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class SweepPlankInfoQuery extends PagingQuery implements Serializable {

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
    private String tradeDate;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    private BigDecimal plankPrice;

    /**
     * 连板板高
     */
    private Integer curDay;

    /**
     * 断板前板高
     */
    private Integer beDay;

    /**
     * 断板天数
     */
    private Integer breDay;

    /**
     * 60日内首板次数
     */
    private Integer fristPlankDay60;

    /**
     * 60日首板最低平均盈利
     */
    private BigDecimal fristPlankAvgProDay60;

    /**
     * 60日内首板最低低点盈利
     */
    private BigDecimal fristPlankLowpRoDay60;

    private Integer endPlankFlag;

    /**
     * 历史板平均盈利
     */
    private BigDecimal plankAvgPro;

    /**
     * 收盘盈利
     */
    private BigDecimal profit;

    /**
     * 平均盈利
     */
    private BigDecimal avgProfit;


    private BigDecimal endPlankOneAmount;
    private BigDecimal endBreakOneAmount;

    private BigDecimal endPlankHighAmount;
    private BigDecimal endBreakHighAmount;

    private BigDecimal endPlankAllAmount;
    private BigDecimal endBreakAllAmount;

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