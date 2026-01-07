package com.bazinga.rabbit.dto;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Data
public class BaoDieTestDTO {
    private String stockCode;
    private String stockName;
    private String tradeDate;

    private BigDecimal openRate;
    private BigDecimal closeRate;
    private BigDecimal dropRate;
    private int intelDays;
    private int dropLevel = 0;
    private String blockCode;
    private String blockName;
    private BigDecimal tradeAmount;

    private String highDate;
    private BigDecimal highDayRate10;
    private BigDecimal highTradeAmount;
    private BigDecimal highPreTradeAmount;

    private BigDecimal profit;

    public static List<BaoDieTestDTO> amountRateSort(List<BaoDieTestDTO> list){
        Collections.sort(list,new DropRateComparator());
        return list;
    }

    static class DropRateComparator implements Comparator<Object> {
        public int compare(Object object1,Object object2){
            BaoDieTestDTO p1 = (BaoDieTestDTO)object1;
            BaoDieTestDTO p2 = (BaoDieTestDTO)object2;
            int i = p1.getDropRate().compareTo(p2.getDropRate());
            return i;
        }
    }
}
