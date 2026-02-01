package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈BlockBatchBuyPool〉<p>
 *
 * @author
 * @date 2023-03-26
 */
@lombok.Data
@lombok.ToString
public class BlockBatchBuyPool implements Serializable {

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
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockCode;

    /**
     * 股票名称
     *
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockName;

    /**
     * 仓位系数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Double positionRatio;
    /**
     * 0 删除  1 正常
     */
    private Integer status;

    private BigDecimal buyRate;

    /**
     * 创建时间
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Date createTime;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date updateTime;


}