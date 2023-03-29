package com.bazinga.rabbit.query;


import com.bazinga.rabbit.base.PagingQuery;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
 * 〈StockWeighDaily 查询参数〉<p>
 *
 * @author
 * @date 2023-03-28
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockWeighDailyQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String tradeDate;

    /**
     * 股票代码
     */
    private String stockCode;

    /**
     * 权重
     */
    private BigDecimal weight;

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