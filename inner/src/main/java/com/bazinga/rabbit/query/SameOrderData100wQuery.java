package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈SameOrderData100w 查询参数〉<p>
 *
 * @author
 * @date 2023-11-21
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class SameOrderData100wQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String stockCode;

    /**
     * 
     */
    private String tradeDate;

    /**
     * 
     */
    private BigDecimal totalMoney;

    /**
     * 
     */
    private BigDecimal money;

    /**
     * 
     */
    private String uniqueKey;

    /**
     * 
     */
    private String timeTrade;

    /**
     * 
     */
    private BigDecimal orderPrice;

    /**
     * 
     */
    private BigDecimal orderVolume;

    /**
     * 
     */
    private Long sameOrderTimes;

    /**
     * 
     */
    private Long orderIndex;


}