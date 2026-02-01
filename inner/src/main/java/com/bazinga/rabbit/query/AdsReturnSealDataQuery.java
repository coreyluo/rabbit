package com.bazinga.rabbit.query;



import com.bazinga.base.PagingQuery;

import java.io.Serializable;

/**
 * 〈AdsReturnSealData 查询参数〉<p>
 *
 * @author
 * @date 2025-07-30
 */
@lombok.Data
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.ToString(callSuper = true)
public class AdsReturnSealDataQuery extends PagingQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    private String stockCode;

    /**
     * 
     */
    private String dateTrade;

    /**
     * 
     */
    private String plankTime;

    /**
     * 
     */
    private Integer returnCount;

    private String unsealedTime;

    private Integer unsealedDiff;


}