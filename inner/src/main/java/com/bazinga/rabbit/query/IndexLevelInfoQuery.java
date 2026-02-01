package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈IndexLevelInfo 查询参数〉<p>
 *
 * @author
 * @date 2024-08-26
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class IndexLevelInfoQuery extends PagingQuery implements Serializable {

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
     * 交易时间
     */
    private String kbarDate;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    /**
     * index1排名
     */
    private Long index1;

    /**
     * index2a排名
     */
    private Long index2a;

    /**
     * index2b排名
     */
    private Long index2b;

    /**
     * index2c排名
     */
    private Long index2c;

    /**
     * index3排名
     */
    private Long index3;

    /**
     * index4排名
     */
    private Long index4;

    /**
     * index5排名
     */
    private Long index5;

    /**
     * index6排名
     */
    private Long index6;

    /**
     * index7排名
     */
    private Long index7;

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