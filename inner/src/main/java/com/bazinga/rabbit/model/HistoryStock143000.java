package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈HistoryStock143000〉<p>
 *
 * @author
 * @date 2024-02-01
 */
@lombok.Data
@lombok.ToString
public class HistoryStock143000 implements Serializable {

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
     * 成交量
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalVolume;

    /**
     * 成交额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalAmount;

    /**
     * 开盘价
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal valOpen;

    /**
     * 最高价
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal valHigh;

    /**
     * 最低价
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal valLow;

    /**
     * 当前价
     *
     * @允许为空   YES
     * @是否索引   NO
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
     * 创建时间
     *
     * @允许为空   YES
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