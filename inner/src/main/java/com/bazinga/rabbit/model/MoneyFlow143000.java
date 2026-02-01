package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈MoneyFlow143000〉<p>
 *
 * @author
 * @date 2024-03-12
 */
@lombok.Data
@lombok.ToString
public class MoneyFlow143000 implements Serializable {

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
     * @允许为空   YES
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
     * 主动超级大单买入金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal activeSuperBuyAmt;

    /**
     * 主动大单买入金额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal activeBigBuyAmt;

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