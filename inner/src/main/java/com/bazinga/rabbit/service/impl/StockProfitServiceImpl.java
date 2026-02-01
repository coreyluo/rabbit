package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockProfitDAO;
import com.bazinga.replay.model.StockProfit;
import com.bazinga.replay.query.StockProfitQuery;
import com.bazinga.replay.service.StockProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockProfit Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-12-12
 */
@Service
public class StockProfitServiceImpl implements StockProfitService {

    @Autowired
    private StockProfitDAO stockProfitDAO;

    @Override
    public StockProfit save(StockProfit record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockProfitDAO.insert(record);
        return record;
    }

    @Override
    public StockProfit getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockProfitDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockProfit record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return stockProfitDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockProfit> listByCondition(StockProfitQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockProfitDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockProfitQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockProfitDAO.countByCondition(query);
    }

    @Override
    public StockProfit getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return stockProfitDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(StockProfit record) {
        Assert.notNull(record, "待更新记录不能为空");
        return stockProfitDAO.updateByUniqueKey(record);
    }
}