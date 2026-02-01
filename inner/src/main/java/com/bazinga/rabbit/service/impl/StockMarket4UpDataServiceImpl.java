package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockMarket4UpDataDAO;
import com.bazinga.replay.model.StockMarket4UpData;
import com.bazinga.replay.query.StockMarket4UpDataQuery;
import com.bazinga.replay.service.StockMarket4UpDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockMarket4UpData Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-03-26
 */
@Service
public class StockMarket4UpDataServiceImpl implements StockMarket4UpDataService {

    @Autowired
    private StockMarket4UpDataDAO stockMarket4UpDataDAO;

    @Override
    public StockMarket4UpData save(StockMarket4UpData record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockMarket4UpDataDAO.insert(record);
        return record;
    }

    @Override
    public StockMarket4UpData getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockMarket4UpDataDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockMarket4UpData record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return stockMarket4UpDataDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockMarket4UpData> listByCondition(StockMarket4UpDataQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockMarket4UpDataDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockMarket4UpDataQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockMarket4UpDataDAO.countByCondition(query);
    }
}