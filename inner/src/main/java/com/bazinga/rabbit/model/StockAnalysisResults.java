package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈StockAnalysisResults〉<p>
 *
 * @author
 * @date 2023-06-20
 */
@lombok.Data
@lombok.ToString
public class StockAnalysisResults implements Serializable {

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
     * @最大长度   300
     * @允许为空   NO
     * @是否索引   YES
     */
    private String tsCode;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long sellTimeTrade;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal sellValClose;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalAmount;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal lowestPrice;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal closingPrice14450;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   YES
     */
    private Long tradeDate;


}