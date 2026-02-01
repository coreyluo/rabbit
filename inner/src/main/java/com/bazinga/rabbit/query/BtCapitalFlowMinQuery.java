package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈BtCapitalFlowMin 查询参数〉<p>
 *
 * @author
 * @date 2025-12-14
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class BtCapitalFlowMinQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String thscode;

    /**
     * 
     */
    private String market;

    /**
     * 
     */
    private String secType;

    /**
     * 交易日期
     */
    private String tradeDate;

    /**
     * 交易时间
     */
    private String tradeTime;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    /**
     * 
     */
    private BigDecimal volumeTrade;

    /**
     * 
     */
    private BigDecimal buyVolume;

    /**
     * 
     */
    private BigDecimal sellVolume;

    /**
     * 
     */
    private BigDecimal activeBuyLargeVol;

    /**
     * 
     */
    private BigDecimal activeSellLargeVol;

    /**
     * 
     */
    private BigDecimal activeBuyLargeAmt;

    /**
     * 
     */
    private BigDecimal activeSellLargeAmt;

    /**
     * 
     */
    private BigDecimal possitiveBuyLargeVol;

    /**
     * 
     */
    private BigDecimal possitiveSellLargeVol;

    /**
     * 
     */
    private BigDecimal possitiveBuyLargeAmt;

    /**
     * 
     */
    private BigDecimal possitiveSellLargeAmt;

    /**
     * 
     */
    private BigDecimal activeBuyMainVol;

    /**
     * 
     */
    private BigDecimal activeSellMainVol;

    /**
     * 
     */
    private BigDecimal activeBuyMainAmt;

    /**
     * 
     */
    private BigDecimal activeSellMainAmt;

    /**
     * 
     */
    private BigDecimal possitiveBuyMainVol;

    /**
     * 
     */
    private BigDecimal possitiveSellMainVol;

    /**
     * 
     */
    private BigDecimal possitiveBuyMainAmt;

    /**
     * 
     */
    private BigDecimal possitiveSellMainAmt;

    /**
     * 
     */
    private BigDecimal activeBuyMiddleVol;

    /**
     * 
     */
    private BigDecimal activeSellMiddleVol;

    /**
     * 
     */
    private BigDecimal activeBuyMiddleAmt;

    /**
     * 
     */
    private BigDecimal activeSellMiddleAmt;

    /**
     * 
     */
    private BigDecimal possitiveBuyMiddleVol;

    /**
     * 
     */
    private BigDecimal possitiveSellMiddleVol;

    /**
     * 
     */
    private BigDecimal possitiveBuyMiddleAmt;

    /**
     * 
     */
    private BigDecimal possitiveSellMiddleAmt;

    /**
     * 
     */
    private BigDecimal activeBuySmallVol;

    /**
     * 
     */
    private BigDecimal activeSellSmallVol;

    /**
     * 
     */
    private BigDecimal activeBuySmallAmt;

    /**
     * 
     */
    private BigDecimal activeSellSmallAmt;

    /**
     * 
     */
    private BigDecimal possitiveBuySmallVol;

    /**
     * 
     */
    private BigDecimal possitiveSellSmallVol;

    /**
     * 
     */
    private BigDecimal possitiveBuySmallAmt;

    /**
     * 
     */
    private BigDecimal possitiveSellSmallAmt;

    /**
     * 
     */
    private BigDecimal seqNum;

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