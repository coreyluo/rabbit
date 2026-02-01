package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈MarketLoverParam〉<p>
 *
 * @author
 * @date 2024-10-20
 */
@lombok.Data
@lombok.ToString
public class MarketLoverParam implements Serializable {

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
     * 股票代码
     *
     * @最大长度   10
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockCode;

    /**
     * 股票名称
     *
     * @最大长度   60
     * @允许为空   YES
     * @是否索引   NO
     */
    private String stockName;

    /**
     * 日期
     *
     * @最大长度   60
     * @允许为空   YES
     * @是否索引   NO
     */
    private String tradeDate;

    /**
     * 唯一索引
     *
     * @最大长度   20
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   unique_key
     */
    private String uniqueKey;

    /**
     * 涨停次数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Integer plankTime;
    private Integer lastPlankTime;

    /**
     * 创建时间
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Date createTime;

    /**
     * 更新时间
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date updateTime;


}