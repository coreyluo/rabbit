package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈GatherBuySellInfo 查询参数〉<p>
 *
 * @author
 * @date 2024-02-26
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class GatherBuySellInfoQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 交易时间
     */
    private String kbarDate;

    /**
     * 集合买单总金额
     */
    private BigDecimal gatherBuyAmount;

    /**
     * 集合买卖单总金额
     */
    private BigDecimal gatherSellAmount;

    /**
     * 前一日成交总金额
     */
    private BigDecimal preTradeAmount;

    /**
     * 买金额除以昨日总成交金额
     */
    private BigDecimal buyTradeAmountRatio;

    /**
     * 卖金额除以昨日总成交金额
     */
    private BigDecimal sellTradeAmountRatio;

    /**
     * 买金额除以卖金额
     */
    private BigDecimal buySellRatio;

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