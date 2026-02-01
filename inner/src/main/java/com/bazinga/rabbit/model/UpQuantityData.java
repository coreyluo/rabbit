package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈UpQuantityData〉<p>
 *
 * @author
 * @date 2025-04-08
 */
@lombok.Data
@lombok.ToString
public class UpQuantityData implements Serializable {

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
     * 代码
     *
     * @最大长度   6
     * @允许为空   NO
     * @是否索引   YES
     */
    private String stockCode;

    /**
     * 日期
     *
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   YES
     */
    private String dateTrade;

    /**
     * 信号价格
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal signalPrice;

    /**
     * 信号时间
     *
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   NO
     */
    private String signalTime;

    /**
     * 信号时刻总成交额
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal signalTotalAmount;

    /**
     * 买入均价
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal buyPrice;

    /**
     * 总成交股数
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal totalVolume;

    /**
     * 相对前一天成交量累积最大比例
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private BigDecimal quantityRatio;

    private Integer boughtKlines;

    /**
     * 
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Date createTime;

    /**
     * 
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date updateTime;


}