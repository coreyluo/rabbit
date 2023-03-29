package com.bazinga.rabbit.controller;


import com.bazinga.rabbit.component.BeiDaStockDailyComponent;
import com.bazinga.rabbit.dto.StockOperateDTO;
import com.bazinga.rabbit.response.PlatformResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/command")
@ResponseBody
@Slf4j
public class CommandController {

    @Autowired
    private BeiDaStockDailyComponent beiDaStockDailyComponent;

    @RequestMapping("getStockWeights")
    public PlatformResult getStockOperates(){
        PlatformResult platformResult = PlatformResult.buildFailureResult();
        try {
            platformResult.setData(beiDaStockDailyComponent.getStockWeights());
            platformResult.setCode(PlatformResult.SUCCESS);
        } catch (Exception e) {
            log.error(e.getMessage(),e);
            platformResult.setMsg(e.getMessage());
        }
        return platformResult;

    }
}
