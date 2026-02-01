package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈MarketStatisticDaily〉<p>
 *
 * @author
 * @date 2025-10-23
 */
@lombok.Data
@lombok.ToString
public class MarketStatisticDaily implements Serializable {

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
     * @唯一索引   kbar_date
     */
    private String kbarDate;

    /**
     * 首板封住数量
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long endPlankOne;

    /**
     * 首板炸板数量
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long endBreakOne;

    private BigDecimal endPlankOneAmount;
    private BigDecimal endBreakOneAmount;

    /**
     * 首版封板率（非st）
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal endPlankOneRatio;

    /**
     * 高位封住数量
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long endPlankHigh;

    /**
     * 高位炸板数量
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long endBreakHigh;

    private BigDecimal endPlankHighAmount;
    private BigDecimal endBreakHighAmount;

    /**
     * 高位版封板率（非st）
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal endPlankHighRatio;

    /**
     * 全市场封住数量
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long endPlankAll;

    /**
     * 全市场炸板数量
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long endBreakAll;

    private BigDecimal endPlankAllAmount;
    private BigDecimal endBreakAllAmount;

    /**
     * 全市场封板率（非st）
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal endPlankAllRatio;

    private Long openSuddenAll;
    private Long endSuddenAll;
    private Long touchSuddenAll;
    private Long openPlankAll;



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