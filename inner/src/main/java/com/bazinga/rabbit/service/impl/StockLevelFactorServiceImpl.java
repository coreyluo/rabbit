package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockLevelFactorDAO;
import com.bazinga.replay.model.StockLevelFactor;
import com.bazinga.replay.query.StockLevelFactorQuery;
import com.bazinga.replay.service.StockLevelFactorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockLevelFactor Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-01-04
 */
@Service
public class StockLevelFactorServiceImpl implements StockLevelFactorService {

    @Autowired
    private StockLevelFactorDAO stockLevelFactorDAO;

    @Override
    public StockLevelFactor save(StockLevelFactor record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockLevelFactorDAO.insert(record);
        return record;
    }

    @Override
    public StockLevelFactor getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockLevelFactorDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockLevelFactor record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return stockLevelFactorDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockLevelFactor> listByCondition(StockLevelFactorQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockLevelFactorDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockLevelFactorQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockLevelFactorDAO.countByCondition(query);
    }

    @Override
    public StockLevelFactor getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return stockLevelFactorDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(StockLevelFactor record) {
        Assert.notNull(record, "待更新记录不能为空");
        return stockLevelFactorDAO.updateByUniqueKey(record);
    }
}