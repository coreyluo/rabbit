package com.bazinga.rabbit.query;


import com.bazinga.base.PagingQuery;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 〈If300OrderSlice 查询参数〉<p>
 *
 * @author
 * @date 2023-03-21
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class If300OrderSliceQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String stockCode;

    /**
     * 
     */
    private String tradeDate;

    /**
     * 
     */
    private String timeTrade;

    /**
     * 
     */
    private BigDecimal buyCount10;

    /**
     * 
     */
    private BigDecimal buyCount20;

    /**
     * 
     */
    private BigDecimal buyCount50;

    /**
     * 
     */
    private BigDecimal buyCount100;

    /**
     * 
     */
    private BigDecimal buyCount200;

    /**
     * 
     */
    private BigDecimal buyCountOver200;

    /**
     * 
     */
    private BigDecimal sellCount10;

    /**
     * 
     */
    private BigDecimal sellCount20;

    /**
     * 
     */
    private BigDecimal sellCount50;

    /**
     * 
     */
    private BigDecimal sellCount100;

    /**
     * 
     */
    private BigDecimal sellCount200;

    /**
     * 
     */
    private BigDecimal sellCountOver200;

    /**
     * 
     */
    private BigDecimal buyVolume10;

    /**
     * 
     */
    private BigDecimal buyVolume20;

    /**
     * 
     */
    private BigDecimal buyVolume50;

    /**
     * 
     */
    private BigDecimal buyVolume100;

    /**
     * 
     */
    private BigDecimal buyVolume200;

    /**
     * 
     */
    private BigDecimal buyVolumeOver200;

    /**
     * 
     */
    private BigDecimal sellVolume10;

    /**
     * 
     */
    private BigDecimal sellVolume20;

    /**
     * 
     */
    private BigDecimal sellVolume50;

    /**
     * 
     */
    private BigDecimal sellVolume100;

    /**
     * 
     */
    private BigDecimal sellVolume200;

    /**
     * 
     */
    private BigDecimal sellVolumeOver200;

    /**
     * 
     */
    private BigDecimal buyMoney10;

    /**
     * 
     */
    private BigDecimal buyMoney20;

    /**
     * 
     */
    private BigDecimal buyMoney50;

    /**
     * 
     */
    private BigDecimal buyMoney100;

    /**
     * 
     */
    private BigDecimal buyMoney200;

    /**
     * 
     */
    private BigDecimal buyMoneyOver200;

    /**
     * 
     */
    private BigDecimal sellMoney10;

    /**
     * 
     */
    private BigDecimal sellMoney20;

    /**
     * 
     */
    private BigDecimal sellMoney50;

    /**
     * 
     */
    private BigDecimal sellMoney100;

    /**
     * 
     */
    private BigDecimal sellMoney200;

    /**
     * 
     */
    private BigDecimal sellMoneyOver200;

    /**
     * 
     */
    private String uniqueKey;


}