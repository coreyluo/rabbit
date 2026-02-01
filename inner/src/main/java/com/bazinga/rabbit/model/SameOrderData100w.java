package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈SameOrderData100w〉<p>
 *
 * @author
 * @date 2023-11-21
 */
@lombok.Data
@lombok.ToString
public class SameOrderData100w implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     *
     * @最大长度   100
     * @允许为空   YES
     * @是否索引   YES
     */
    private String stockCode;

    /**
     * 
     *
     * @最大长度   100
     * @允许为空   YES
     * @是否索引   YES
     */
    private String tradeDate;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalMoney;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal money;

    /**
     * 
     *
     * @最大长度   200
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   uk_unique_key
     */
    private String uniqueKey;

    /**
     * 
     *
     * @最大长度   60
     * @允许为空   YES
     * @是否索引   NO
     */
    private String timeTrade;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal orderPrice;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal orderVolume;

    /**
     * 
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Long sameOrderTimes;

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
    private Long orderIndex;


}