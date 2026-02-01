package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈OpenInfoData〉<p>
 *
 * @author
 * @date 2024-01-30
 */
@lombok.Data
@lombok.ToString
public class OpenInfoData implements Serializable {

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
    private String dateTrade;

    /**
     * 
     *
     * @最大长度   28
     * @允许为空   YES
     * @是否索引   NO
     */
    private String timeTrade;

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
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalVolume;

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
    private BigDecimal totalAskQty;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalBidQty;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date createTime;


}