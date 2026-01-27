package com.bazinga.rabbit.enums;

public enum AiStrategyEnum {

    WU_DI_V1("WU_DI_V1","无敌v1"),
    WU_DI_V2("WU_DI_V2","无敌v2"),
    WU_DI_V3("WU_DI_V3","无敌v3"),
    WU_DI_V4("WU_DI_V4","无敌v3"),
    WU_DI_V5("WU_DI_V5","无敌v5"),
    WU_DI_V6("WU_DI_V6","无敌v6"),
    WU_DI_V7("WU_DI_V7","无敌v6"),
    LAO_HE_V1("LAO_HE_V1","老何v1"),
    LAO_HE_V2("LAO_HE_V2","老何v2"),
    LAO_HE_V3("LAO_HE_V3","老何v3"),
    LAO_HE_V4("LAO_HE_V4","老何v4"),
    LAO_HE_V5("LAO_HE_V5","老何v5"),
    LAO_HE_V6("LAO_HE_V6","老何v6"),
    LAO_WANG_V1("LAO_WANG_V1","老汪v1"),
    LAO_WANG_V2("LAO_WANG_V2","老汪v1"),
    LAO_WANG_V3("LAO_WANG_V3","老汪v3"),
    LAO_WANG_V4("LAO_WANG_V4","老汪v4"),
    LAO_WANG_V5("LAO_WANG_V5","老汪v5"),
    LAO_WANG_V6("LAO_WANG_V6","老汪v6");

    AiStrategyEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    private String code;

    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
