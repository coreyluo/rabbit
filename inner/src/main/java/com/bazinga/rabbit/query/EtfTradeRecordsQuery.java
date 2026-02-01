package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈EtfTradeRecords 查询参数〉<p>
 *
 * @author
 * @date 2025-11-14
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class EtfTradeRecordsQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 策略ID
     */
    private Integer strategyId;

    /**
     * 交易日期 开始
     */
    private Date tradeDateFrom;

    /**
     * 交易日期 结束
     */
    private Date tradeDateTo;

    /**
     * 标的代码
     */
    private String symbol;

    /**
     * 交易动作
     */
    private String action;

    /**
     * 交易数量
     */
    private Integer quantity;

    /**
     * 交易价格
     */
    private Float price;

    /**
     * 交易金额
     */
    private Float amount;

    /**
     * 手续费
     */
    private Float commission;

    /**
     * 创建时间 开始
     */
    private Date createdAtFrom;

    /**
     * 创建时间 结束
     */
    private Date createdAtTo;

    /**
     * 更新时间 开始
     */
    private Date updatedAtFrom;

    /**
     * 更新时间 结束
     */
    private Date updatedAtTo;


}