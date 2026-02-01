package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈HistoryBlockDetail〉<p>
 *
 * @author
 * @date 2023-06-12
 */
@lombok.Data
@lombok.ToString
public class HistoryBlockDetail implements Serializable {

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
     * 板块代码
     *
     * @最大长度   10
     * @允许为空   NO
     * @是否索引   YES
     */
    private String blockCode;

    /**
     * 板块名称
     *
     * @最大长度   60
     * @允许为空   YES
     * @是否索引   NO
     */
    private String blockName;

    /**
     * 股票代码
     *
     * @最大长度   60
     * @允许为空   YES
     * @是否索引   YES
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
     * blockcode_stockcode_tradeDate
     *
     * @最大长度   60
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   unique_key
     */
    private String uniqueKey;

    /**
     * 板块日期
     *
     * @最大长度   60
     * @允许为空   YES
     * @是否索引   YES
     */
    private String tradeDate;

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