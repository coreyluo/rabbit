package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockKbar143000DAO;
import com.bazinga.replay.model.StockKbar143000;
import com.bazinga.replay.query.StockKbar143000Query;
import com.bazinga.replay.service.StockKbar143000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockKbar143000 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-01
 */
@Service
public class StockKbar143000ServiceImpl implements StockKbar143000Service {

    @Autowired
    private StockKbar143000DAO stockKbar143000DAO;

    @Override
    public StockKbar143000 save(StockKbar143000 record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockKbar143000DAO.insert(record);
        return record;
    }

    @Override
    public StockKbar143000 getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockKbar143000DAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockKbar143000 record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return stockKbar143000DAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockKbar143000> listByCondition(StockKbar143000Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockKbar143000DAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockKbar143000Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockKbar143000DAO.countByCondition(query);
    }

    @Override
    public StockKbar143000 getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return stockKbar143000DAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(StockKbar143000 record) {
        Assert.notNull(record, "待更新记录不能为空");
        return stockKbar143000DAO.updateByUniqueKey(record);
    }
}