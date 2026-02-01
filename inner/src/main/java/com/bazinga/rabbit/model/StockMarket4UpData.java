package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockMarket4UpData〉<p>
 *
 * @author
 * @date 2025-03-26
 */
@lombok.Data
@lombok.ToString
public class StockMarket4UpData implements Serializable {

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
     * 代码
     *
     * @最大长度   6
     * @允许为空   NO
     * @是否索引   YES
     */
    private String stockCode;

    /**
     * 日期
     *
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   YES
     */
    private String dateTrade;

    /**
     * 4个点价格
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal highPrice;

    /**
     * 交易时间
     *
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   NO
     */
    private String timeTrade;
    private Long timeTradeNum;

    /**
     * 行情价
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal latest;

    /**
     * 总成交股数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalVolume;

    /**
     * 总成交额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalAmount;

    /**
     * 均价
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal avgPrice;

    /**
     * 总买金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalBuyAmount;

    /**
     * 总卖金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalSellAmount;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date createTime;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date updateTime;


}