package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈ActFactorInfo〉<p>
 *
 * @author
 * @date 2025-08-14
 */
@lombok.Data
@lombok.ToString
public class ActFactorInfo implements Serializable {

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
    private String tradeDate;

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
     * 近10日涨停封住次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer plankCountDay10;

    /**
     * 近10日涨次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer raiseCountDay10;

    /**
     * 近10日涨收盘涨幅总和
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal raiseTotalRateDay10;

    /**
     * 近10日跌次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer fallCountDay10;

    /**
     * 近10日跌收盘涨幅总和
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal fallTotalRateDay10;

    /**
     * 涨停价是否是近十日新高1 是 0 不是
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer plankPriceHighDay10;

    /**
     * 近10日相对最低点涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateThanLowDay10;

    /**
     * 近20日涨停封住次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer plankCountDay20;

    /**
     * 近20日涨次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer raiseCountDay20;

    /**
     * 近20日涨收盘涨幅总和
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal raiseTotalRateDay20;

    /**
     * 近20日跌次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer fallCountDay20;

    /**
     * 近20日跌收盘涨幅总和
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal fallTotalRateDay20;

    /**
     * 涨停价是否是近二十日新高1 是 0 不是
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer plankPriceHighDay20;

    /**
     * 近20日相对最低点涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateThanLowDay20;

    /**
     * 近10日振幅总和
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal ampTotalRateDay10;

    /**
     * 个股10振幅减上证
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal ampRateSubSzDay10;

    /**
     * 热股1 是 0 不是
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer hotFlag;

    /**
     * 近3日触碰涨停次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer touchPlankDay3;

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