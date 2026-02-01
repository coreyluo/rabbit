package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ��StockAnalysisResults ��ѯ������<p>
 *
 * @author
 * @date 2023-06-20
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class StockAnalysisResultsQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String tsCode;

    /**
     * 
     */
    private Long sellTimeTrade;

    /**
     * 
     */
    private BigDecimal sellValClose;

    /**
     * 
     */
    private BigDecimal totalAmount;

    /**
     * 
     */
    private BigDecimal lowestPrice;

    /**
     * 
     */
    private BigDecimal closingPrice14450;

    /**
     * 
     */
    private Long tradeDate;


}