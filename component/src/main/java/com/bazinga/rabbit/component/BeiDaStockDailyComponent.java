package com.bazinga.rabbit.component;


import com.bazinga.rabbit.dto.StockOperateDTO;
import com.bazinga.rabbit.model.StockWeighDaily;
import com.bazinga.rabbit.query.StockWeighDailyQuery;
import com.bazinga.rabbit.service.StockWeighDailyService;
import com.bazinga.rabbit.util.DateUtil;
import com.bazinga.rabbit.util.ZipUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Slf4j
public class BeiDaStockDailyComponent {

    @Autowired
    private StockWeighDailyService stockWeighDailyService;

    @Autowired
    private CommonComponent commonComponent;

    public void unzipAnd2Db(){

        String fileDirectory = "/home/user2/strat/";

        Date preTradeDate = commonComponent.preTradeDate(new Date());
        String preTradeDateString = DateUtil.format(preTradeDate,DateUtil.yyyyMMdd);
        String tradeDate = DateUtil.format(new Date(),DateUtil.yyyyMMdd);
       // tradeDate = "20230302";
        try {
            ZipUtil.gunzip(fileDirectory + preTradeDateString + ".csv.gz");
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }

        File file = new File(fileDirectory + preTradeDateString+".csv");
        if(file.exists()){
            try {
                List<String> list = FileUtils.readLines(file, "UTF-8");

                for (int i = 1; i < list.size(); i++) {
                    String line = list.get(i);
                    String[] arr = line.split(",");
                    StockWeighDaily stockWeighDaily = new StockWeighDaily();
                    stockWeighDaily.setStockCode(arr[0].substring(0,6));
                    stockWeighDaily.setTradeDate(tradeDate);
                    stockWeighDaily.setWeight(new BigDecimal(arr[1]));
                    stockWeighDailyService.save(stockWeighDaily);
                }
                log.info("stockCode count{}",list.size());
            } catch (IOException e) {
                log.info(e.getMessage(),e);
            }

        }else {
            log.info("未找到文件 {}.csv",tradeDate);
        }
    }


    public List<StockOperateDTO> getStockWeights(){
        String tradeDate = DateUtil.format(new Date(),DateUtil.yyyyMMdd);
       // tradeDate = "20230302";
        StockWeighDailyQuery query = new StockWeighDailyQuery();
        query.setTradeDate(tradeDate);
        List<StockWeighDaily> stockWeighDailies = stockWeighDailyService.listByCondition(query);
        List<StockOperateDTO> returnList = new ArrayList<>();
        for (StockWeighDaily stockWeighDaily : stockWeighDailies) {
            StockOperateDTO stockOperateDTO = new StockOperateDTO();
            BeanUtils.copyProperties(stockWeighDaily,stockOperateDTO);
            returnList.add(stockOperateDTO);
        }
        return returnList;


    }
}
