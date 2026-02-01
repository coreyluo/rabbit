package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈IndexBeforeRate 查询参数〉<p>
 *
 * @author
 * @date 2025-10-23
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class IndexBeforeRateQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指数代码
     */
    private String indexCode;

    /**
     * 指数名称
     */
    private String indexName;

    /**
     * 交易时间
     */
    private String kbarDate;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    /**
     * 1日涨幅
     */
    private BigDecimal rateDay1;

    /**
     * 2日涨幅
     */
    private BigDecimal rateDay2;

    /**
     * 3日涨幅
     */
    private BigDecimal rateDay3;

    /**
     * 5日涨幅
     */
    private BigDecimal rateDay5;

    /**
     * 
     */
    private BigDecimal openRate;

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