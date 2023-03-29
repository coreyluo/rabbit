package com.bazinga.rabbit.component;



import com.bazinga.rabbit.base.Sort;
import com.bazinga.rabbit.model.TradeDatePool;
import com.bazinga.rabbit.query.TradeDatePoolQuery;
import com.bazinga.rabbit.service.TradeDatePoolService;
import com.bazinga.rabbit.util.DateTimeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Slf4j
public class CommonComponent {
    @Autowired
    private TradeDatePoolService tradeDatePoolService;


    public Date preTradeDate(Date date){
        TradeDatePoolQuery query = new TradeDatePoolQuery();
        query.setTradeDateTo(DateTimeUtils.getDate000000(date));
        query.addOrderBy("trade_date", Sort.SortType.DESC);
        List<TradeDatePool> dates = tradeDatePoolService.listByCondition(query);
        if(CollectionUtils.isEmpty(dates)){
            return new Date();
        }
        return dates.get(0).getTradeDate();
    }

    public Date afterTradeDate(Date date){
        TradeDatePoolQuery query = new TradeDatePoolQuery();
        query.setTradeDateFrom(DateTimeUtils.getDate235959(date));
        query.addOrderBy("trade_date",Sort.SortType.ASC);
        List<TradeDatePool> dates = tradeDatePoolService.listByCondition(query);
        if(CollectionUtils.isEmpty(dates)){
            return null;
        }
        return dates.get(0).getTradeDate();
    }


    public boolean isTradeDate(Date date){
        TradeDatePoolQuery query = new TradeDatePoolQuery();
        query.setTradeDateFrom(DateTimeUtils.getDate000000(date));
        query.setTradeDateTo(DateTimeUtils.getDate235959(date));
        List<TradeDatePool> dates = tradeDatePoolService.listByCondition(query);
        if(CollectionUtils.isEmpty(dates)){
            return false;
        }
        return true;
    }




}
