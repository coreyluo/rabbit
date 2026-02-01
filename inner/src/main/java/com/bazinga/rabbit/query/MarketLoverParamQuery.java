package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈MarketLoverParam 查询参数〉<p>
 *
 * @author
 * @date 2024-10-20
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class MarketLoverParamQuery extends PagingQuery implements Serializable {

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
     * 日期
     */
    private String tradeDate;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    /**
     * 涨停次数
     */
    private Integer plankTime;
    private Integer lastPlankTime;

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