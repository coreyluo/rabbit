package com.bazinga.rabbit.query;


import com.bazinga.rabbit.base.PagingQuery;

import java.util.Date;
import java.util.Date;

import java.io.Serializable;

/**
 * 〈TradeDatePool 查询参数〉<p>
 *
 * @author
 * @date 2023-03-29
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class TradeDatePoolQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *  交易日期 开始
     */
    private Date tradeDateFrom;

    /**
     *  交易日期 结束
     */
    private Date tradeDateTo;

    /**
     *  开始
     */
    private Date createTimeFrom;

    /**
     *  结束
     */
    private Date createTimeTo;


}