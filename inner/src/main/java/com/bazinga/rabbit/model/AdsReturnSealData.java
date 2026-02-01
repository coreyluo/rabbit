package com.bazinga.rabbit.model;


import java.io.Serializable;

/**
 * 〈AdsReturnSealData〉<p>
 *
 * @author
 * @date 2025-07-30
 */
@lombok.Data
@lombok.ToString
public class AdsReturnSealData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     *
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   PRIMARY
     */
    private Integer id;

    /**
     * 
     *
     * @最大长度   6
     * @允许为空   NO
     * @是否索引   YES
     */
    private String stockCode;

    /**
     * 
     *
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   YES
     */
    private String dateTrade;

    /**
     * 
     *
     * @最大长度   100
     * @允许为空   NO
     * @是否索引   NO
     */
    private String plankTime;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer returnCount;

    private String unsealedTime;

    private Integer unsealedDiff;


}