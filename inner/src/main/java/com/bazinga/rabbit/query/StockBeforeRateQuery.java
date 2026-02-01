package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockBeforeRate 查询参数〉<p>
 *
 * @author
 * @date 2023-12-28
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockBeforeRateQuery extends PagingQuery implements Serializable {

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
     * 3日最大涨幅(去除新股开板前时间)
     */
    private BigDecimal rateDay3;

    /**
     * 5日最大涨幅(去除新股开板前时间)
     */
    private BigDecimal rateDay5;

    /**
     * 10日最大涨幅(去除新股开板前时间)
     */
    private BigDecimal rateDay10;

    /**
     * 20日最大涨幅(去除新股开板前时间)
     */
    private BigDecimal rateDay20;

    /**
     * 30日最大涨幅(去除新股开板前时间)
     */
    private BigDecimal rateDay30;

    /**
     * 40日最大涨幅(去除新股开板前时间)
     */
    private BigDecimal rateDay40;

    /**
     * 60日最大涨幅(去除新股开板前时间)
     */
    private BigDecimal rateDay60;

    private BigDecimal actRateDay3;
    private BigDecimal actRateDay5;
    private BigDecimal actRateDay10;
    private BigDecimal actRateDay15;
    private BigDecimal actRateDay30;

    private Integer plankTimes220;
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