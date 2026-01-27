package com.bazinga.rabbit.enums;

/**
 * @author yunshan
 * @date 2019/2/16
 */
public enum AccountSellTypeEnum {

    ALL_SELL(0,"所有股票都卖出"),
    PLANK_SELL(1,"只卖出板票");

    private Integer code;

    private String desc;

    AccountSellTypeEnum(Integer code, String desc) {
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
