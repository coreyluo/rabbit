package com.bazinga.rabbit.dto;

import com.bazinga.dragon.model.StockBeforeRateRatio;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ButtonConfigDTO {
    private boolean uppersButton  = false;
    private boolean cancelButton  = false;
    private boolean shButton = false;
    private Long delay300Mill = 0L;
    private boolean riskControlButton = true;
    private BigDecimal unmatchPercentRatio = null;

    private StockBeforeRateRatio stockBeforeRateRatio;
    //涨幅过高相关系数
    private BigDecimal positionRatio;
    private BigDecimal rateDay3Ratio;
    private BigDecimal rateDay5Ratio;
    private BigDecimal rateDay10Ratio;
    private BigDecimal rateDay20Ratio;
    private BigDecimal rateDay30Ratio;
    private BigDecimal rateDay40Ratio;
    private BigDecimal rateDay60Ratio;
    private boolean dragonPlankBuyV1 = false;
}
