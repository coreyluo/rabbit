package com.bazinga.rabbit.dto;

import com.bazinga.dragon.enums.SellStrategyEnum;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yunshan
 * @date 2019/3/4
 */
@Data
public class OrderSellDTO {
    private String stockCode;
    //需要执行的策略
    private List<SellStrategyEnum> strategyEnums = new ArrayList<>();
    private CommonQuoteDTO commonQuoteDTO;
    private DetailOrderDTO detailOrderDTO;
}
