package com.bazinga.rabbit.query;



import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈AdsIm1000StockFeaturePredDataV1Dd 查询参数〉<p>
 *
 * @author
 * @date 2023-08-20
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class AdsIm1000StockFeaturePredDataV1DdQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private Long dateTrade;

    /**
     * 
     */
    private Long stockCode;

    /**
     * 
     */
    private Double profit;

    /**
     * 
     */
    private Long profitClassify;

    /**
     * 
     */
    private Long predData;

    /**
     * 
     */
    private Double predDataProba;

    /**
     * 
     */
    private Double predDataValue;

    private Integer plankFlag;
    private BigDecimal profitEndSell;


}