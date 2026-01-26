package com.bazinga.rabbit.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author yunshan
 * @date 2019/2/18
 */
@Data
public class PriceCountDTO {

    /**
     * 买一价
     */
    private BigDecimal price;

    private  Integer count ;

}
