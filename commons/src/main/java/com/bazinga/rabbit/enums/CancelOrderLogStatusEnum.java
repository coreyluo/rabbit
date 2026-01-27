package com.bazinga.rabbit.enums;

public enum CancelOrderLogStatusEnum {
    INIT(0,"初始化"),
    SUCCESS(1,"报单成功"),
    FAILURE(-1,"撤单失败");

    private Integer code;

    private String desc;

    CancelOrderLogStatusEnum(Integer code, String desc) {
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
