package com.bazinga.rabbit.component;


import com.bazinga.rabbit.model.ThsCirculateInfo;
import com.bazinga.rabbit.model.TradeDatePool;
import com.bazinga.rabbit.query.ThsCirculateInfoQuery;
import com.bazinga.rabbit.service.ThsCirculateInfoService;
import com.bazinga.rabbit.util.DateUtil;
import com.bazinga.rabbit.util.MarketUtil;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author yunshan
 * @date 2019/1/25
 */
@Component
@Slf4j
public class ThsCirculateInfoComponent {
    @Autowired
    private ThsCirculateInfoService thsCirculateInfoService;
    @Autowired
    private TradeDatePoolComponent tradeDatePoolComponent;

    /**
     * 获取当天市场上所有的股票
     * @param tradeDate 20220101
     * @return
     */
    public List<ThsCirculateInfo> getMarketACirculate(String tradeDate){
        ThsCirculateInfoQuery thsCirculateInfoQuery = new ThsCirculateInfoQuery();
        thsCirculateInfoQuery.setTradeDate(tradeDate);
        List<ThsCirculateInfo> thsCirculateInfos = thsCirculateInfoService.listByCondition(thsCirculateInfoQuery);
        return thsCirculateInfos;
    }
    public List<ThsCirculateInfo> getStockCirculate(String stockCode){
        ThsCirculateInfoQuery thsCirculateInfoQuery = new ThsCirculateInfoQuery();
        thsCirculateInfoQuery.setStockCode(stockCode);
        List<ThsCirculateInfo> thsCirculateInfos = thsCirculateInfoService.listByCondition(thsCirculateInfoQuery);
        return thsCirculateInfos;
    }


    public List<ThsCirculateInfo> getAllMarketCirculateInfo(){
        Map<String,ThsCirculateInfo> thsCirculateInfoMap = new HashMap<>();
        List<TradeDatePool> tradeDatePools = tradeDatePoolComponent.getTradeDatePools("20180101", null);
        List<TradeDatePool> reverse = Lists.reverse(tradeDatePools);
        for (TradeDatePool tradeDatePool:reverse){
            String tradeDateStr = DateUtil.format(tradeDatePool.getTradeDate(), DateUtil.yyyyMMdd);
            System.out.println(tradeDateStr);
            List<ThsCirculateInfo> circulateInfos = getMarketACirculate(tradeDateStr);
            for (ThsCirculateInfo circulateInfo:circulateInfos){
                if(thsCirculateInfoMap.get(circulateInfo.getStockCode())==null) {
                    thsCirculateInfoMap.put(circulateInfo.getStockCode(), circulateInfo);
                    System.out.println(circulateInfo.getStockCode() + "====" + circulateInfo.getStockName() + "======" + thsCirculateInfoMap.size());
                }
            }
        }
        List<ThsCirculateInfo> list = Lists.newArrayList();
        for (String stockCode:thsCirculateInfoMap.keySet()){
            ThsCirculateInfo thsCirculateInfo = thsCirculateInfoMap.get(stockCode);
            list.add(thsCirculateInfo);
        }
        return list;
    }


    public List<ThsCirculateInfo> getNoKeChuangMarketCirculateInfo(){
        Map<String,ThsCirculateInfo> thsCirculateInfoMap = new HashMap<>();
        List<TradeDatePool> tradeDatePools = tradeDatePoolComponent.getTradeDatePools("20180101", null);
        List<TradeDatePool> reverse = Lists.reverse(tradeDatePools);
        for (TradeDatePool tradeDatePool:reverse){
            String tradeDateStr = DateUtil.format(tradeDatePool.getTradeDate(), DateUtil.yyyyMMdd);
            System.out.println(tradeDateStr);
            List<ThsCirculateInfo> circulateInfos = getMarketACirculate(tradeDateStr);
            for (ThsCirculateInfo circulateInfo:circulateInfos){
                if(thsCirculateInfoMap.get(circulateInfo.getStockCode())==null) {
                    thsCirculateInfoMap.put(circulateInfo.getStockCode(), circulateInfo);
                    System.out.println(circulateInfo.getStockCode() + "====" + circulateInfo.getStockName() + "======" + thsCirculateInfoMap.size());
                }
            }
        }
        List<ThsCirculateInfo> list = Lists.newArrayList();
        for (String stockCode:thsCirculateInfoMap.keySet()){
            ThsCirculateInfo thsCirculateInfo = thsCirculateInfoMap.get(stockCode);
            if(MarketUtil.isKeChuang(stockCode)){
                continue;
            }
            list.add(thsCirculateInfo);
        }
        return list;
    }

    public List<ThsCirculateInfo> getKeChuangMarketCirculateInfo(String tradeDate){
        List<ThsCirculateInfo> marketACirculate = getMarketACirculate(tradeDate);
        List<ThsCirculateInfo> list = Lists.newArrayList();
        for (ThsCirculateInfo thsCirculateInfo:marketACirculate){
           if(MarketUtil.isKeChuang(thsCirculateInfo.getStockCode())) {
               list.add(thsCirculateInfo);
           }
        }
        return list;
    }


}
