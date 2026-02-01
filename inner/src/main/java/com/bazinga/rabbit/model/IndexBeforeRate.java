package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈IndexBeforeRate〉<p>
 *
 * @author
 * @date 2025-10-23
 */
@lombok.Data
@lombok.ToString
public class IndexBeforeRate implements Serializable {

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
     * 指数代码
     *
     * @最大长度   10
     * @允许为空   NO
     * @是否索引   YES
     */
    private String indexCode;

    /**
     * 指数名称
     *
     * @最大长度   60
     * @允许为空   NO
     * @是否索引   NO
     */
    private String indexName;

    /**
     * 交易时间
     *
     * @最大长度   10
     * @允许为空   NO
     * @是否索引   YES
     */
    private String kbarDate;

    /**
     * 唯一索引
     *
     * @最大长度   20
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   uk_unique_key
     */
    private String uniqueKey;

    /**
     * 1日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay1;

    /**
     * 2日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay2;

    /**
     * 3日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay3;

    /**
     * 5日涨幅
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal rateDay5;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal openRate;

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