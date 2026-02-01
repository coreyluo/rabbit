package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈OpenInfoData 查询参数〉<p>
 *
 * @author
 * @date 2024-01-30
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class OpenInfoDataQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String stockCode;

    /**
     * 
     */
    private String dateTrade;

    /**
     * 
     */
    private String timeTrade;

    /**
     * 
     */
    private String uniqueKey;

    /**
     * 
     */
    private BigDecimal totalVolume;

    /**
     * 
     */
    private BigDecimal totalAmount;

    /**
     * 
     */
    private BigDecimal totalAskQty;

    /**
     * 
     */
    private BigDecimal totalBidQty;

    /**
     *  开始
     */
    private Date createTimeFrom;

    /**
     *  结束
     */
    private Date createTimeTo;


}