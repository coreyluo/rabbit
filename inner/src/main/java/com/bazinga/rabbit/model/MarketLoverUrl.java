package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈MarketLoverUrl〉<p>
 *
 * @author
 * @date 2024-10-20
 */
@lombok.Data
@lombok.ToString
public class MarketLoverUrl implements Serializable {

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
     * url
     *
     * @最大长度   10
     * @允许为空   YES
     * @是否索引   NO
     */
    private String url;

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