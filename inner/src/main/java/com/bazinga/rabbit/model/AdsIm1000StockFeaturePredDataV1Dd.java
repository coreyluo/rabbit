package com.bazinga.rabbit.model;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈AdsIm1000StockFeaturePredDataV1Dd〉<p>
 *
 * @author
 * @date 2023-08-20
 */
@lombok.Data
@lombok.ToString
public class AdsIm1000StockFeaturePredDataV1Dd implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     *
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   PRIMARY
     */
    private Long id;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long dateTrade;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long stockCode;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Double profit;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long profitClassify;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long predData;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Double predDataProba;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Double predDataValue;

    private Integer plankFlag;
    private BigDecimal profitEndSell;


}