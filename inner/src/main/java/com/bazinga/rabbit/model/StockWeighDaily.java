package com.bazinga.rabbit.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
 * 〈StockWeighDaily〉<p>
 *
 * @author
 * @date 2023-03-28
 */
@lombok.Data
@lombok.ToString
public class StockWeighDaily implements Serializable {

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
     * 
     *
     * @最大长度   20
     * @允许为空   NO
     * @是否索引   NO
     */
    private String tradeDate;

    /**
     * 股票代码
     *
     * @最大长度   20
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockCode;

    /**
     * 权重
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private BigDecimal weight;

    /**
     * 创建时间
     *
     * @允许为空   NO
     * @是否索引   YES
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