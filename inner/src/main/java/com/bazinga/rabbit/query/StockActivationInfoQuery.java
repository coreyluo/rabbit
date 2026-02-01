package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockActivationInfo 查询参数〉<p>
 *
 * @author
 * @date 2025-07-24
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockActivationInfoQuery extends PagingQuery implements Serializable {

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
     * 近10日涨停封住次数
     */
    private Integer endPlankTimeDay10;

    /**
     * 近10日振幅总和（每天相加）
     */
    private BigDecimal ampAddDay10;

    /**
     * 近10日收盘涨日次数
     */
    private Integer endRedTimeDay10;

    /**
     * 近10日收盘涨日涨幅总和
     */
    private BigDecimal endRedAddDay10;

    /**
     * 近10日收盘跌日次数
     */
    private Integer endGreenTimeDay10;

    /**
     * 近10日收盘跌日涨幅总和
     */
    private BigDecimal endGreenAddDay10;

    /**
     * 近20日涨停封住次数
     */
    private Integer endPlankTimeDay20;

    /**
     * 近20日振幅总和（每天相加）
     */
    private BigDecimal ampAddDay20;

    /**
     * 近20日收盘涨日次数
     */
    private Integer endRedTimeDay20;

    /**
     * 近20日收盘涨日涨幅总和
     */
    private BigDecimal endRedAddDay20;

    /**
     * 近20日收盘跌日次数
     */
    private Integer endGreenTimeDay20;

    /**
     * 近20日收盘跌日涨幅总和
     */
    private BigDecimal endGreenAddDay20;

    /**
     * 涨停价是否是近10日新高(以收盘价新高)1新高 0没有
     */
    private Integer plankPriceHighDay10;

    /**
     * 涨停价是否是近20日新高(以收盘价新高)1新高 0没有
     */
    private Integer plankPriceHighDay20;

    /**
     * 近10日最高相对最低点涨幅
     */
    private BigDecimal ampDay10;

    /**
     * 近20日最高相对最低点涨幅
     */
    private BigDecimal ampDay20;

    /**
     * 近3日触及涨停数量
     */
    private Integer touchPlankTimeDay3;

    /**
     * 近3日触及涨停数量
     */
    private Integer containEntityTimeDay10;
    private Integer containEntityTimeDay5;
    private Integer containEntityTimeDay20;

    /**
     * 第一次涨幅大于5%(10%)，到涨停之间的时间差（秒）
     */
    private Integer rate5ToPlankMill;

    /**
     * 是否触及涨停（0 未触及 1触及涨停）
     */
    private Integer touchFlag;

    private Integer hotFlag;

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