package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈EtfTradeRecords〉<p>
 *
 * @author
 * @date 2025-11-14
 */
@lombok.Data
@lombok.ToString
public class EtfTradeRecords implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     *
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   PRIMARY
     */
    private Integer id;

    /**
     * 策略ID
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer strategyId;

    /**
     * 交易日期
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Date tradeDate;

    /**
     * 标的代码
     *
     * @最大长度   50
     * @允许为空   NO
     * @是否索引   NO
     */
    private String symbol;

    /**
     * 交易动作
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private String action;

    /**
     * 交易数量
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer quantity;

    /**
     * 交易价格
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Float price;

    /**
     * 交易金额
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Float amount;

    /**
     * 手续费
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Float commission;

    /**
     * 创建时间
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date createdAt;

    /**
     * 更新时间
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date updatedAt;


}