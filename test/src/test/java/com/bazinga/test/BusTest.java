package com.bazinga.test;

import com.bazinga.rabbit.component.BeiDaStockDailyComponent;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BusTest extends BaseTestCase {

    @Autowired
    private BeiDaStockDailyComponent beiDaStockDailyComponent;

    @Test
    public void  test(){
        System.out.println(111);


    }


}
