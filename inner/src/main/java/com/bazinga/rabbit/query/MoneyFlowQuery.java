package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈MoneyFlow 查询参数〉<p>
 *
 * @author
 * @date 2024-03-10
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class MoneyFlowQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 股票代码
     */
    private String stockCode;

    /**
     * 股票名称
     */
    private String stockName;

    /**
     * 交易时间
     */
    private String kbarDate;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    /**
     * 主动超级大单买入金额
     */
    private BigDecimal activeSuperBuyAmt;

    /**
     * 主动大单买入金额
     */
    private BigDecimal activeBigBuyAmt;
    /**
     * 主动超级大单卖出金额
     */
    private BigDecimal activeSuperSellAmt;

    /**
     * 主动大单卖出金额
     */
    private BigDecimal activeBigSellAmt;

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