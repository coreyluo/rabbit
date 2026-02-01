package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈GatherBuySellInfo〉<p>
 *
 * @author
 * @date 2024-02-26
 */
@lombok.Data
@lombok.ToString
public class GatherBuySellInfo implements Serializable {

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
     * @最大长度   10
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   uk_kbar_date
     */
    private String kbarDate;

    /**
     * 集合买单总金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal gatherBuyAmount;

    /**
     * 集合买卖单总金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal gatherSellAmount;

    /**
     * 前一日成交总金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal preTradeAmount;

    /**
     * 买金额除以昨日总成交金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal buyTradeAmountRatio;

    /**
     * 卖金额除以昨日总成交金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal sellTradeAmountRatio;

    /**
     * 买金额除以卖金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal buySellRatio;

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