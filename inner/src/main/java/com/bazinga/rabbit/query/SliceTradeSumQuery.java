package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈SliceTradeSum 查询参数〉<p>
 *
 * @author
 * @date 2023-03-21
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class SliceTradeSumQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 交易时间
     */
    private String kbarDate;

    /**
     * 分片截止时间
     */
    private String sliceTimeTo;

    /**
     * 1 正常; 2 权重前30票; 3 权重前90票; 4 成交金额前30票; 5 成交金额前90票
     */
    private Integer sliceType;

    /**
     * 数量0-10
     */
    private Integer countBuy0;

    /**
     * 数量10-20
     */
    private Integer countBuy10;

    /**
     * 数量20-30
     */
    private Integer countBuy20;

    /**
     * 数量0-10
     */
    private Integer countBuy50;

    /**
     * 数量0-10
     */
    private Integer countBuy100;

    /**
     * 数量0-10
     */
    private Integer countBuy200;

    /**
     * 成交金额
     */
    private BigDecimal amountBuy0;

    /**
     * 成交金额
     */
    private BigDecimal amountBuy10;

    /**
     * 成交金额
     */
    private BigDecimal amountBuy20;

    /**
     * 成交金额
     */
    private BigDecimal amountBuy50;

    /**
     * 成交金额
     */
    private BigDecimal amountBuy100;

    /**
     * 成交金额
     */
    private BigDecimal amountBuy200;

    /**
     * 成交手数
     */
    private Long volumeBuy0;

    /**
     * 成交手数
     */
    private Long volumeBuy10;

    /**
     * 成交手数
     */
    private Long volumeBuy20;

    /**
     * 成交手数
     */
    private Long volumeBuy50;

    /**
     * 成交手数
     */
    private Long volumeBuy100;

    /**
     * 成交手数
     */
    private Long volumeBuy200;

    /**
     * 数量0-10
     */
    private Integer countSell0;

    /**
     * 数量10-20
     */
    private Integer countSell10;

    /**
     * 数量20-30
     */
    private Integer countSell20;

    /**
     * 数量0-10
     */
    private Integer countSell50;

    /**
     * 数量0-10
     */
    private Integer countSell100;

    /**
     * 数量0-10
     */
    private Integer countSell200;

    /**
     * 成交金额
     */
    private BigDecimal amountSell0;

    /**
     * 成交金额
     */
    private BigDecimal amountSell10;

    /**
     * 成交金额
     */
    private BigDecimal amountSell20;

    /**
     * 成交金额
     */
    private BigDecimal amountSell50;

    /**
     * 成交金额
     */
    private BigDecimal amountSell100;

    /**
     * 成交金额
     */
    private BigDecimal amountSell200;

    /**
     * 成交手数
     */
    private Long volumeSell0;

    /**
     * 成交手数
     */
    private Long volumeSell10;

    /**
     * 成交手数
     */
    private Long volumeSell20;

    /**
     * 成交手数
     */
    private Long volumeSell50;

    /**
     * 成交手数
     */
    private Long volumeSell100;

    /**
     * 成交手数
     */
    private Long volumeSell200;

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