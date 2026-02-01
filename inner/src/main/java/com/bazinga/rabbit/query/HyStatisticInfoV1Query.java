package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈HyStatisticInfoV1 查询参数〉<p>
 *
 * @author
 * @date 2023-10-15
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class HyStatisticInfoV1Query extends PagingQuery implements Serializable {

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
     * 交易日期
     */
    private String tradeDate;

    /**
     * 高于zz1000的幅度次数
     */
    private Integer upZz1000Time;

    /**
     * 低于zz1000的幅度次数
     */
    private Integer downZz1000Time;

    /**
     * 高于zz1000的幅度累计
     */
    private BigDecimal upZz1000Total;

    /**
     * 低于zz1000的幅度累计
     */
    private BigDecimal downZz1000Total;

    /**
     * 3日高于zz1000的幅度次数
     */
    private Integer upZz1000TimeDay3;

    /**
     * 3日低于zz1000的幅度次数
     */
    private Integer downZz1000TimeDay3;

    /**
     * 3日高于zz1000的幅度累计
     */
    private BigDecimal upZz1000TotalDay3;

    /**
     * 3日低于zz1000的幅度累计
     */
    private BigDecimal downZz1000TotalDay3;

    /**
     * 半小时划分高于zz1000的幅度次数
     */
    private Integer strongPeriodTime;

    /**
     * 半小时划分低于zz1000的幅度累计
     */
    private BigDecimal strongPeriodTotal;

    /**
     * 交易日期
     */
    private String strongPeriod;

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

    /**
     * 
     */
    private BigDecimal profit;


}