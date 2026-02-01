package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockPreBasicDataV1 查询参数〉<p>
 *
 * @author
 * @date 2023-06-20
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockPreBasicDataV1Query extends PagingQuery implements Serializable {

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
    private String tradeDate;

    private BigDecimal openRate;

    /**
     * 集合成交金额
     */
    private BigDecimal gatherAmount;

    /**
     * 集合换手率
     */
    private BigDecimal gatherTurnRate;

    /**
     * 前10日涨停次数
     */
    private Integer plankTimesDay10;

    /**
     * 前10日炸板次数
     */
    private Integer breakTimesDay10;

    /**
     * 前10日封住涨停次数
     */
    private Integer sealTimesDay10;

    /**
     * 前一日连板高度
     */
    private Integer continueTimes;

    /**
     * 是否是创业板0不是创业板 1是创业板
     */
    private Integer gemFlag;

    /**
     * 成交金额
     */
    private BigDecimal tradeAmount;

    /**
     * 成交额换手率
     */
    private BigDecimal turnRate;

    /**
     * 3日涨幅
     */
    private BigDecimal rateDay3;

    /**
     * 5日涨幅
     */
    private BigDecimal rateDay5;

    /**
     * 10日涨幅
     */
    private BigDecimal rateDay10;

    /**
     * 20日涨幅
     */
    private BigDecimal rateDay20;

    /**
     * 买入日收盘是否封住0未封住1封住
     */
    private Integer endPlankFlag;

    /**
     * 收盘涨幅
     */
    private BigDecimal endRate;

    /**
     * 收盘相对开盘涨幅
     */
    private BigDecimal entityRate;

    /**
     * 前一日收盘涨幅
     */
    private BigDecimal beforeEndRate;

    /**
     * 前一日收盘相对开盘涨幅
     */
    private BigDecimal beforeEntityRate;

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

    /**
     * 
     */
    private BigDecimal profit;


}