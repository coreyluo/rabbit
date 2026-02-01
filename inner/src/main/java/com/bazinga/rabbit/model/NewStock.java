package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈NewStock〉<p>
 *
 * @author
 * @date 2021-05-10
 */
@lombok.Data
@lombok.ToString
public class NewStock implements Serializable {

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
     * 
     *
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockCode;

    /**
     * 
     *
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockName;

    /**
     * 
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Date marketDate;

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
