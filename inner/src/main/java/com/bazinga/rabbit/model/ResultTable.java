package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈ResultTable〉<p>
 *
 * @author
 * @date 2023-06-20
 */
@lombok.Data
@lombok.ToString
public class ResultTable implements Serializable {

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
     * @允许为空   NO
     * @是否索引   YES
     */
    private Integer dateTrade;

    /**
     * 
     *
     * @最大长度   10
     * @允许为空   NO
     * @是否索引   YES
     */
    private String thscode;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalTradeMoney;


}