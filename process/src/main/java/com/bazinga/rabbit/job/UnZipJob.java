package com.bazinga.rabbit.job;


import com.bazinga.rabbit.component.BeiDaStockDailyComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UnZipJob {

    @Autowired
    private BeiDaStockDailyComponent beiDaStockDailyComponent;

    public void execute(){
        log.info("<---------UnZipJob start------------->");
        try {
            beiDaStockDailyComponent.unzipAnd2Db();
        } catch (Exception e) {
            log.info(e.getMessage(),e);
        }
        log.info("<---------UnZipJob stop------------->");


    }
}
