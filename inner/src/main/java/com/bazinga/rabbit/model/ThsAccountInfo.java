package com.bazinga.rabbit.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈ThsAccountInfo〉<p>
 *
 * @author
 * @date 2024-02-20
 */
@lombok.Data
@lombok.ToString
public class ThsAccountInfo implements Serializable {

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
     * refresh_token
     *
     * @最大长度   2147483647
     * @允许为空   NO
     * @是否索引   NO
     */
    private String refreshToken;

    /**
     * 账号
     *
     * @最大长度   20
     * @允许为空   NO
     * @是否索引   NO
     */
    private String account;

    /**
     * 密码
     *
     * @最大长度   20
     * @允许为空   NO
     * @是否索引   NO
     */
    private String password;

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