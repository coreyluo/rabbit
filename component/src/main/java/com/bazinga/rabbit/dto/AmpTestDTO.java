package com.bazinga.rabbit.dto;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
public class AmpTestDTO {
    private String stockCode;
    private String stockName;
    private String tradeDate;
    private String ampDate;

    private BigDecimal openRate;
    private boolean openPlankFlag;
    private BigDecimal ampRate;
    private Integer ampLevel;
    private BigDecimal highRate;
    private BigDecimal lowRate;

    private BigDecimal ampCloseRate;
    private BigDecimal ampOpenRate;

    private BigDecimal rateDay3;
    private BigDecimal rateDay5;
    private BigDecimal rateDay10;

    private BigDecimal tradeAmount;
    private BigDecimal preTradeAmount;

    private BigDecimal profit;

    public static List<AmpTestDTO> ampRateSort(List<AmpTestDTO> list){
        Collections.sort(list,new AmpRateComparator());
        return list;
    }

    static class AmpRateComparator implements Comparator<Object> {
        public int compare(Object object1,Object object2){
            AmpTestDTO p1 = (AmpTestDTO)object1;
            AmpTestDTO p2 = (AmpTestDTO)object2;
            int i = p2.getAmpRate().compareTo(p1.getAmpRate());
            return i;
        }
    }
}
