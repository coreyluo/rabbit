package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈ActFactorInfo 查询参数〉<p>
 *
 * @author
 * @date 2025-08-14
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class ActFactorInfoQuery extends PagingQuery implements Serializable {

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

    /**
     * 近10日涨停封住次数
     */
    private Integer plankCountDay10;

    /**
     * 近10日涨次数
     */
    private Integer raiseCountDay10;

    /**
     * 近10日涨收盘涨幅总和
     */
    private BigDecimal raiseTotalRateDay10;

    /**
     * 近10日跌次数
     */
    private Integer fallCountDay10;

    /**
     * 近10日跌收盘涨幅总和
     */
    private BigDecimal fallTotalRateDay10;

    /**
     * 涨停价是否是近十日新高1 是 0 不是
     */
    private Integer plankPriceHighDay10;

    /**
     * 近10日相对最低点涨幅
     */
    private BigDecimal rateThanLowDay10;

    /**
     * 近20日涨停封住次数
     */
    private Integer plankCountDay20;

    /**
     * 近20日涨次数
     */
    private Integer raiseCountDay20;

    /**
     * 近20日涨收盘涨幅总和
     */
    private BigDecimal raiseTotalRateDay20;

    /**
     * 近20日跌次数
     */
    private Integer fallCountDay20;

    /**
     * 近20日跌收盘涨幅总和
     */
    private BigDecimal fallTotalRateDay20;

    /**
     * 涨停价是否是近二十日新高1 是 0 不是
     */
    private Integer plankPriceHighDay20;

    /**
     * 近20日相对最低点涨幅
     */
    private BigDecimal rateThanLowDay20;

    /**
     * 近10日振幅总和
     */
    private BigDecimal ampTotalRateDay10;

    /**
     * 个股10振幅减上证
     */
    private BigDecimal ampRateSubSzDay10;

    /**
     * 热股1 是 0 不是
     */
    private Integer hotFlag;

    /**
     * 近3日触碰涨停次数
     */
    private Integer touchPlankDay3;

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