package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈StockPreBasicDataV1〉<p>
 *
 * @author
 * @date 2023-06-20
 */
@lombok.Data
@lombok.ToString
public class StockPreBasicDataV1 implements Serializable {

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

    private BigDecimal openRate;

    /**
     * 集合成交金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal gatherAmount;

    /**
     * 集合换手率
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal gatherTurnRate;

    /**
     * 前10日涨停次数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer plankTimesDay10;

    /**
     * 前10日炸板次数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer breakTimesDay10;

    /**
     * 前10日封住涨停次数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer sealTimesDay10;

    /**
     * 前一日连板高度
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer continueTimes;

    /**
     * 是否是创业板0不是创业板 1是创业板
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer gemFlag;

    /**
     * 成交金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal tradeAmount;

    /**
     * 成交额换手率
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal turnRate;

    /**
     * 3日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay3;

    /**
     * 5日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay5;

    /**
     * 10日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay10;

    /**
     * 20日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay20;

    /**
     * 买入日收盘是否封住0未封住1封住
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer endPlankFlag;

    /**
     * 收盘涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal endRate;

    /**
     * 收盘相对开盘涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal entityRate;

    /**
     * 前一日收盘涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal beforeEndRate;

    /**
     * 前一日收盘相对开盘涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal beforeEntityRate;

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