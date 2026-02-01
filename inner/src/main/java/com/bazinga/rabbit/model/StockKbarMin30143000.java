package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockKbarMin30143000〉<p>
 *
 * @author
 * @date 2024-03-03
 */
@lombok.Data
@lombok.ToString
public class StockKbarMin30143000 implements Serializable {

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
     * 
     *
     * @最大长度   300
     * @允许为空   YES
     * @是否索引   YES
     */
    private String stockCode;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal tradeAmount;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal tradeVolume;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal closePrice;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal openPrice;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal highPrice;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal lowPrice;

    private BigDecimal macd;
    private BigDecimal diff;
    private BigDecimal dea;
    private BigDecimal bias6;
    private BigDecimal bias12;
    private BigDecimal bias24;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   YES
     */
    private Long tradeDate;

    /**
     * 创建时间
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date createTime;


}