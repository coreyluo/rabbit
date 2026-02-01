package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈StockLevelFactor 查询参数〉<p>
 *
 * @author
 * @date 2024-01-04
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockLevelFactorQuery extends PagingQuery implements Serializable {

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
     * 换手率排名
     */
    private Long trunRatioLevel;

    /**
     * 换手率序号
     */
    private Long trunRatioNum;

    /**
     * 成交金额排名
     */
    private Long tradeAmountLevel;

    /**
     * 成交金额序号
     */
    private Long tradeAmountNum;

    /**
     * rate3排名
     */
    private Long rate3Level;

    /**
     * rate3序号
     */
    private Long rate3Num;

    /**
     * rate5排名
     */
    private Long rate5Level;

    /**
     * rate5序号
     */
    private Long rate5Num;

    /**
     * rate10排名
     */
    private Long rate10Level;

    /**
     * rate10序号
     */
    private Long rate10Num;

    /**
     * rate15排名
     */
    private Long rate15Level;

    /**
     * rate15序号
     */
    private Long rate15Num;

    /**
     * rate30排名
     */
    private Long rate30Level;

    /**
     * rate30序号
     */
    private Long rate30Num;

    /**
     * 当日涨幅排名
     */
    private Long rateEndLevel;

    /**
     * 当日涨幅序号
     */
    private Long rateEndNum;

    /**
     * 当日振幅排名
     */
    private Long rateAmpLevel;

    /**
     * 当日振幅序号
     */
    private Long rateAmpNum;

    /**
     * 市值排名
     */
    private Long marketValueLevel;

    /**
     * 市值序号
     */
    private Long marketValueNum;

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