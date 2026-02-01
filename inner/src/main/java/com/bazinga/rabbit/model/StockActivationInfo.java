package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockActivationInfo〉<p>
 *
 * @author
 * @date 2025-07-24
 */
@lombok.Data
@lombok.ToString
public class StockActivationInfo implements Serializable {

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
     * 近10日涨停封住次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer endPlankTimeDay10;

    /**
     * 近10日振幅总和（每天相加）
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal ampAddDay10;

    /**
     * 近10日收盘涨日次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer endRedTimeDay10;

    /**
     * 近10日收盘涨日涨幅总和
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal endRedAddDay10;

    /**
     * 近10日收盘跌日次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer endGreenTimeDay10;

    /**
     * 近10日收盘跌日涨幅总和
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal endGreenAddDay10;

    /**
     * 近20日涨停封住次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer endPlankTimeDay20;

    /**
     * 近20日振幅总和（每天相加）
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal ampAddDay20;

    /**
     * 近20日收盘涨日次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer endRedTimeDay20;

    /**
     * 近20日收盘涨日涨幅总和
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal endRedAddDay20;

    /**
     * 近20日收盘跌日次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer endGreenTimeDay20;

    /**
     * 近20日收盘跌日涨幅总和
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal endGreenAddDay20;

    /**
     * 涨停价是否是近10日新高(以收盘价新高)1新高 0没有
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer plankPriceHighDay10;

    /**
     * 涨停价是否是近20日新高(以收盘价新高)1新高 0没有
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer plankPriceHighDay20;

    /**
     * 近10日最高相对最低点涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal ampDay10;

    /**
     * 近20日最高相对最低点涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal ampDay20;

    /**
     * 近3日触及涨停数量
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer touchPlankTimeDay3;

    /**
     * 近3日触及涨停数量
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer containEntityTimeDay10;
    private Integer containEntityTimeDay5;
    private Integer containEntityTimeDay20;

    /**
     * 第一次涨幅大于5%(10%)，到涨停之间的时间差（秒）
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer rate5ToPlankMill;

    /**
     * 是否触及涨停（0 未触及 1触及涨停）
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer touchFlag;

    private Integer hotFlag;

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