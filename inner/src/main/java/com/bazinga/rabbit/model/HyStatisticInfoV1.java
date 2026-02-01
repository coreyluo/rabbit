package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈HyStatisticInfoV1〉<p>
 *
 * @author
 * @date 2023-10-15
 */
@lombok.Data
@lombok.ToString
public class HyStatisticInfoV1 implements Serializable {

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
     * 股票代码
     *
     * @最大长度   60
     * @允许为空   YES
     * @是否索引   YES
     */
    private String stockCode;

    /**
     * 股票名称
     *
     * @最大长度   60
     * @允许为空   YES
     * @是否索引   NO
     */
    private String stockName;

    /**
     * 交易日期
     *
     * @最大长度   60
     * @允许为空   YES
     * @是否索引   YES
     */
    private String tradeDate;

    /**
     * 高于zz1000的幅度次数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer upZz1000Time;

    /**
     * 低于zz1000的幅度次数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer downZz1000Time;

    /**
     * 高于zz1000的幅度累计
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal upZz1000Total;

    /**
     * 低于zz1000的幅度累计
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal downZz1000Total;

    /**
     * 3日高于zz1000的幅度次数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer upZz1000TimeDay3;

    /**
     * 3日低于zz1000的幅度次数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer downZz1000TimeDay3;

    /**
     * 3日高于zz1000的幅度累计
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal upZz1000TotalDay3;

    /**
     * 3日低于zz1000的幅度累计
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal downZz1000TotalDay3;

    /**
     * 半小时划分高于zz1000的幅度次数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer strongPeriodTime;

    /**
     * 半小时划分低于zz1000的幅度累计
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal strongPeriodTotal;

    /**
     * 交易日期
     *
     * @最大长度   60
     * @允许为空   YES
     * @是否索引   NO
     */
    private String strongPeriod;

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

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal profit;


}