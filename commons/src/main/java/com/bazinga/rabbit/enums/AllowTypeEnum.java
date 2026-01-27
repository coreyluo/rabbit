package com.bazinga.rabbit.enums;

/**
 * @author yunshan
 * @date 2019/2/16
 */
public enum AllowTypeEnum {

    ENABLE(1,"允许"),
    DISABLE(0,"禁止");

    private Integer code;

    private String desc;

    AllowTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
