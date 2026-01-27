package com.bazinga.rabbit.enums;

/**
 * @author yunshan
 * @date 2019/2/16
 */
public enum BlockBatchBuyPoolStatusEnum {

    DELETE(0,"已删除"),
    NOMAL(1,"正常");


    private Integer code;

    private String desc;

    BlockBatchBuyPoolStatusEnum(Integer code, String desc) {
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
