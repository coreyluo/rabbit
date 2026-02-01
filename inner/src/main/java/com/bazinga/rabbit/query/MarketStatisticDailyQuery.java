package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈MarketStatisticDaily 查询参数〉<p>
 *
 * @author
 * @date 2025-10-23
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class MarketStatisticDailyQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 交易时间
     */
    private String kbarDate;

    /**
     * 首板封住数量
     */
    private Long endPlankOne;

    /**
     * 首板炸板数量
     */
    private Long endBreakOne;

    private BigDecimal endPlankOneAmount;
    private BigDecimal endBreakOneAmount;

    /**
     * 首版封板率（非st）
     */
    private BigDecimal endPlankOneRatio;

    /**
     * 高位封住数量
     */
    private Long endPlankHigh;

    /**
     * 高位炸板数量
     */
    private Long endBreakHigh;
    private BigDecimal endPlankHighAmount;
    private BigDecimal endBreakHighAmount;

    /**
     * 高位版封板率（非st）
     */
    private BigDecimal endPlankHighRatio;

    /**
     * 全市场封住数量
     */
    private Long endPlankAll;

    /**
     * 全市场炸板数量
     */
    private Long endBreakAll;
    private BigDecimal endPlankAllAmount;
    private BigDecimal endBreakAllAmount;

    /**
     * 全市场封板率（非st）
     */
    private BigDecimal endPlankAllRatio;

    private Long openSuddenAll;
    private Long endSuddenAll;
    private Long touchSuddenAll;
    private Long openPlankAll;

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