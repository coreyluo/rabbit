package com.bazinga.rabbit.component;


import com.bazinga.rabbit.dto.BaiGuTestDTO;
import com.bazinga.rabbit.model.ThsStockKbar;
import com.bazinga.rabbit.service.RedisMoniorService;
import com.bazinga.rabbit.service.StockBeforeRateService;
import com.bazinga.rabbit.service.StockFactorService;
import com.bazinga.rabbit.service.ThsStockKbarService;
import com.bazinga.rabbit.util.PriceUtil;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * @author yunshan
 * @date 2019/1/25
 */
@Component
@Slf4j
public class BaiGuTestComponent {

    @Autowired
    private ThsCirculateInfoComponent thsCirculateInfoComponent;
    @Autowired
    private ThsStockKbarService thsStockKbarService;
    @Autowired
    private TradeDatePoolComponent tradeDatePoolComponent;
    @Autowired
    private RedisMoniorService redisMoniorService;
    @Autowired
    private ThsQuoteInfoComponent thsQuoteInfoComponent;
    @Autowired
    private StockFactorService stockFactorService;
    @Autowired
    private StockBeforeRateService stockBeforeRateService;
    @Autowired
    private ThsStockKbarComponent thsStockKbarComponent;

    public void baiGuTestExcel(){
        List<BaiGuTestDTO> dtos = baiGuTest();
        List<Object[]> datas = Lists.newArrayList();
        for (BaiGuTestDTO dto:dtos) {
            List<Object> list = new ArrayList<>();
            list.add(dto.getTradeDate());
            list.add(dto.getTradeDate());
            list.add(dto.getCount());
            Object[] objects = list.toArray();
            datas.add(objects);
        }
        String[] rowNames = {"index","tradeDate",
                "count"};
        PoiExcelUtil poiExcelUtil = new PoiExcelUtil("封板数量",rowNames,datas);
        try {
            poiExcelUtil.exportExcelUseExcelTitle("封板数量");
        }catch (Exception e){
            log.info(e.getMessage());
        }
    }

    public List<BaiGuTestDTO> baiGuTest(){
        List<BaiGuTestDTO> list = Lists.newArrayList();
        List<String> tradeDates = tradeDatePoolComponent.getTradeDates("20220101", "20240125");
        for (String tradeDate:tradeDates){
            int i = 0;
            System.out.println(tradeDate);
            List<ThsStockKbar> allStockKBars = thsStockKbarComponent.getDayStockKbars(tradeDate);
            for (ThsStockKbar thsStockKbar:allStockKBars){
                boolean historyUpperPrice = PriceUtil.isHistoryUpperPrice(thsStockKbar.getStockCode(), thsStockKbar.getClosePrice(), thsStockKbar.getZeroPrice(), thsStockKbar.getKbarDate());
                if(historyUpperPrice){
                    i++;
                }
            }
            BaiGuTestDTO baiGuTestDTO = new BaiGuTestDTO();
            baiGuTestDTO.setTradeDate(tradeDate);
            baiGuTestDTO.setCount(i);
            list.add(baiGuTestDTO);
        }
        return list;
    }


}
