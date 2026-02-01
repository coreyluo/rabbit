package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈IndexDetail 查询参数〉<p>
 *
 * @author
 * @date 2022-03-03
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class IndexDetailQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指数代码
     */
    private String indexCode;

    /**
     * 指数名称
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
     * 日期
     */
    private String kbarDate;
    private BigDecimal weight;

    /**
     * 创建时间 开始
     */
    private Date createTimeFrom;

    /**
     * 创建时间 结束
     */
    private Date createTimeTo;


}