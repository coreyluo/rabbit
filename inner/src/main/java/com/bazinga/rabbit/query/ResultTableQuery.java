package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈ResultTable 查询参数〉<p>
 *
 * @author
 * @date 2023-06-20
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class ResultTableQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Integer dateTrade;

    /**
     * 
     */
    private String thscode;

    /**
     * 
     */
    private BigDecimal totalTradeMoney;


}