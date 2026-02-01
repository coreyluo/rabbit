package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈UpQuantityData 查询参数〉<p>
 *
 * @author
 * @date 2025-04-08
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class UpQuantityDataQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 代码
     */
    private String stockCode;

    /**
     * 日期
     */
    private String dateTrade;

    /**
     * 信号价格
     */
    private BigDecimal signalPrice;

    /**
     * 信号时间
     */
    private String signalTime;

    /**
     * 信号时刻总成交额
     */
    private BigDecimal signalTotalAmount;

    /**
     * 买入均价
     */
    private BigDecimal buyPrice;

    /**
     * 总成交股数
     */
    private BigDecimal totalVolume;

    /**
     * 相对前一天成交量累积最大比例
     */
    private BigDecimal quantityRatio;

    private Integer boughtKlines;

    /**
     *  开始
     */
    private Date createTimeFrom;

    /**
     *  结束
     */
    private Date createTimeTo;

    /**
     *  开始
     */
    private Date updateTimeFrom;

    /**
     *  结束
     */
    private Date updateTimeTo;


}