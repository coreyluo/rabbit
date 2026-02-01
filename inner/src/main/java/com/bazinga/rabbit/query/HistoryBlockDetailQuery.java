package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈HistoryBlockDetail 查询参数〉<p>
 *
 * @author
 * @date 2023-06-12
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class HistoryBlockDetailQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 板块代码
     */
    private String blockCode;

    /**
     * 板块名称
     */
    private String blockName;

    /**
     * 股票代码
     */
    private String stockCode;

    /**
     * 股票名称
     */
    private String stockName;

    /**
     * blockcode_stockcode_tradeDate
     */
    private String uniqueKey;

    /**
     * 板块日期
     */
    private String tradeDate;

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