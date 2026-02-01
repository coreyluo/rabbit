package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈SliceTradeSum〉<p>
 *
 * @author
 * @date 2023-03-21
 */
@lombok.Data
@lombok.ToString
public class SliceTradeSum implements Serializable {

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
     * 交易时间
     *
     * @最大长度   20
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   uk_kbar_date
     */
    private String kbarDate;

    /**
     * 分片截止时间
     *
     * @最大长度   50
     * @允许为空   NO
     * @是否索引   NO
     */
    private String sliceTimeTo;

    /**
     * 1 正常; 2 权重前30票; 3 权重前90票; 4 成交金额前30票; 5 成交金额前90票
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer sliceType;

    /**
     * 数量0-10
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countBuy0;

    /**
     * 数量10-20
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countBuy10;

    /**
     * 数量20-30
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countBuy20;

    /**
     * 数量0-10
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countBuy50;

    /**
     * 数量0-10
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countBuy100;

    /**
     * 数量0-10
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countBuy200;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountBuy0;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountBuy10;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountBuy20;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountBuy50;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountBuy100;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountBuy200;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeBuy0;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeBuy10;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeBuy20;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeBuy50;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeBuy100;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeBuy200;

    /**
     * 数量0-10
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countSell0;

    /**
     * 数量10-20
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countSell10;

    /**
     * 数量20-30
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countSell20;

    /**
     * 数量0-10
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countSell50;

    /**
     * 数量0-10
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countSell100;

    /**
     * 数量0-10
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer countSell200;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountSell0;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountSell10;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountSell20;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountSell50;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountSell100;

    /**
     * 成交金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal amountSell200;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeSell0;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeSell10;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeSell20;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeSell50;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeSell100;

    /**
     * 成交手数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long volumeSell200;

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