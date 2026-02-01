package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈DisableSellStockPool〉<p>
 *
 * @author
 * @date 2023-03-29
 */
@lombok.Data
@lombok.ToString
public class DisableSellStockPool implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
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
     * @唯一索引   uk_stock_code
     */
    private String stockCode;

    /**
     * 股票名称
     *
     * @最大长度   30
     * @允许为空   YES
     * @是否索引   NO
     */
    private String stockName;

    private Integer status;

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