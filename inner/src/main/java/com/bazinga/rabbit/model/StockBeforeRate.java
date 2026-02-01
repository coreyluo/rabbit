package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockBeforeRate〉<p>
 *
 * @author
 * @date 2023-12-28
 */
@lombok.Data
@lombok.ToString
public class StockBeforeRate implements Serializable {

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
    private String kbarDate;

    /**
     * 唯一索引
     *
     * @最大长度   20
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   uk_unique_key
     */
    private String uniqueKey;

    /**
     * 3日最大涨幅(去除新股开板前时间)
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay3;

    /**
     * 5日最大涨幅(去除新股开板前时间)
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay5;

    /**
     * 10日最大涨幅(去除新股开板前时间)
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay10;

    /**
     * 20日最大涨幅(去除新股开板前时间)
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay20;

    /**
     * 30日最大涨幅(去除新股开板前时间)
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay30;

    /**
     * 40日最大涨幅(去除新股开板前时间)
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay40;

    /**
     * 60日最大涨幅(去除新股开板前时间)
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay60;

    private BigDecimal actRateDay3;
    private BigDecimal actRateDay5;
    private BigDecimal actRateDay10;
    private BigDecimal actRateDay15;
    private BigDecimal actRateDay30;

    private Integer plankTimes220;
    /**
     * 连续20各交易日强于zz1000的涨幅
     */
    private BigDecimal strongThan1000;
    /**
     * 连续3各交易日强于zz1000的涨幅
     */
    private BigDecimal strongThan10003;
    /**
     * 连续5各交易日强于zz1000的涨幅
     */
    private BigDecimal strongThan10005;
    /**
     * 次日涨停价bias24
     */
    private BigDecimal afterDayPlankBias24;
    private BigDecimal preAmount;
    private BigDecimal preFiveAvgAmount;
    private Integer preIsHighAmtDay5;
    private BigDecimal highAmtDay5;
    private Integer touchPlankTimeDay10;
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