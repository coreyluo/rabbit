package com.bazinga.rabbit.dto;


import lombok.Data;

import java.util.List;


/**
 * @author yunshan
 * @date 2019/3/4
 */
@Data
public class BlockStockDragonLevelDTO {

    private String blockCode;
    private String blockName;
    private List<String> levels;
    private List<String> levels300;

}
