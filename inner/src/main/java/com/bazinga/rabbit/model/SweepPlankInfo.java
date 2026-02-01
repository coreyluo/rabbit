package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈SweepPlankInfo〉<p>
 *
 * @author
 * @date 2024-11-06
 */
@lombok.Data
@lombok.ToString
public class SweepPlankInfo implements Serializable {

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
     * @最大长度   10
     * @允许为空   NO
     * @是否索引   YES
     */
    private String stockCode;

    /**
     * 股票名称
     *
     * @最大长度   60
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockName;

    /**
     * 交易时间
     *
     * @最大长度   10
     * @允许为空   NO
     * @是否索引   YES
     */
    private String tradeDate;

    /**
     * 唯一索引
     *
     * @最大长度   20
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   uk_unique_key
     */
    private String uniqueKey;

    private BigDecimal plankPrice;

    /**
     * 连板板高
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer curDay;

    /**
     * 断板前板高
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer beDay;

    /**
     * 断板天数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer breDay;

    /**
     * 60日内首板次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer fristPlankDay60;

    /**
     * 60日首板最低平均盈利
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal fristPlankAvgProDay60;


    /**
     * 60日内首板最低低点盈利
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal fristPlankLowpRoDay60;

    private Integer endPlankFlag;

    /**
     * 历史板平均盈利
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal plankAvgPro;

    /**
     * 收盘盈利
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal profit;

    /**
     * 平均盈利
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal avgProfit;

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