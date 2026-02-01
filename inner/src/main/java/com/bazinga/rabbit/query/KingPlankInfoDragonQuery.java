package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈KingPlankInfoDragon 查询参数〉<p>
 *
 * @author
 * @date 2025-11-10
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class KingPlankInfoDragonQuery extends PagingQuery implements Serializable {

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
    private String tradeDate;

    /**
     * 唯一索引
     */
    private String uniqueKey;

    /**
     * 连板板高
     */
    private Integer curDay;

    /**
     * 断板前板高
     */
    private Integer beDay;

    /**
     * 断板天数
     */
    private Integer breDay;

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