package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈IndexLevelInfo〉<p>
 *
 * @author
 * @date 2024-08-26
 */
@lombok.Data
@lombok.ToString
public class IndexLevelInfo implements Serializable {

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
     * @是否索引   YES
     */
    private String stockCode;

    /**
     * 股票名称
     *
     * @最大长度   60
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockName;

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
     * index1排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long index1;

    /**
     * index2a排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long index2a;

    /**
     * index2b排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long index2b;

    /**
     * index2c排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long index2c;

    /**
     * index3排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long index3;

    /**
     * index4排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long index4;

    /**
     * index5排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long index5;

    /**
     * index6排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long index6;

    /**
     * index7排名
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Long index7;

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