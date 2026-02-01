package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockProfit〉<p>
 *
 * @author
 * @date 2023-12-12
 */
@lombok.Data
@lombok.ToString
public class StockProfit implements Serializable {

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
     * 收盘买次日收盘卖
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal endSellEnd1;

    /**
     * 收盘卖两日收盘卖出
     *
     * @允许为空   NO
     * @是否索引   NO
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