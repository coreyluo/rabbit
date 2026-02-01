package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈ThsStockKbar〉<p>
 *
 * @author
 * @date 2022-11-18
 */
@lombok.Data
@lombok.ToString
public class ThsStockKbar implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     *
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   PRIMARY
     */
    private Long id;

    /**
     * 股票代码
     *
     * @最大长度   10
     * @允许为空   NO
     * @是否索引   YES
     */
    private String stockCode;

    /**
     * 股票名称
     *
     * @最大长度   60
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockName;

    /**
     * 交易时间
     *
     * @最大长度   10
     * @允许为空   NO
     * @是否索引   YES
     */
    private String kbarDate;

    /**
     * 唯一索引
     *
     * @最大长度   20
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   uk_unique_key
     */
    private String uniqueKey;

    /**
     * 开盘价
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal openPrice;

    /**
     * 收盘价
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal closePrice;

    /**
     * 最高价
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal highPrice;

    /**
     * 最低价
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal lowPrice;

    /**
     * 开盘价
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal adjOpenPrice;

    /**
     * 收盘价
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal adjClosePrice;

    /**
     * 最高价
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal adjHighPrice;

    /**
     * 最低价
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal adjLowPrice;


    private BigDecimal aftAdjOpenPrice;


    private BigDecimal aftAdjClosePrice;


    private BigDecimal aftAdjHighPrice;


    private BigDecimal aftAdjLowPrice;

    /**
     * 今日0轴价格
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal zeroPrice;

    /**
     * 复权因子
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal adjFactor;

    /**
     * 成交数量(单位手)
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long tradeQuantity;

    /**
     * 成交额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal tradeAmount;

    /**
     * PE
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal pe;

    /**
     * 换手率
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal turnRatio;

    /**
     * 流通市值
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal marketValue;

    private BigDecimal realMarketValue;

    private Long shareCirculate;
    private BigDecimal shareMarketValue;


    private BigDecimal macd;
    private BigDecimal diff;
    private BigDecimal dea;
    private BigDecimal bias6;
    private BigDecimal bias12;
    private BigDecimal bias24;

    /**
     * 创建时间
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Date createTime;

    /**
     * 更新时间
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date updateTime;


}