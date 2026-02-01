package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈StockLevelFactor〉<p>
 *
 * @author
 * @date 2024-01-04
 */
@lombok.Data
@lombok.ToString
public class StockLevelFactor implements Serializable {

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
     * 换手率排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long trunRatioLevel;

    /**
     * 换手率序号
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long trunRatioNum;

    /**
     * 成交金额排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long tradeAmountLevel;

    /**
     * 成交金额序号
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long tradeAmountNum;

    /**
     * rate3排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rate3Level;

    /**
     * rate3序号
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rate3Num;

    /**
     * rate5排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rate5Level;

    /**
     * rate5序号
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rate5Num;

    /**
     * rate10排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rate10Level;

    /**
     * rate10序号
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rate10Num;

    /**
     * rate15排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rate15Level;

    /**
     * rate15序号
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rate15Num;

    /**
     * rate30排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rate30Level;

    /**
     * rate30序号
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rate30Num;

    /**
     * 当日涨幅排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rateEndLevel;

    /**
     * 当日涨幅序号
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rateEndNum;

    /**
     * 当日振幅排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rateAmpLevel;

    /**
     * 当日振幅序号
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long rateAmpNum;

    /**
     * 市值排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long marketValueLevel;

    /**
     * 市值序号
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long marketValueNum;

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