package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockKbarMin30143000DAO;
import com.bazinga.replay.model.StockKbarMin30143000;
import com.bazinga.replay.query.StockKbarMin30143000Query;
import com.bazinga.replay.service.StockKbarMin30143000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockKbarMin30143000 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-03
 */
@Service
public class StockKbarMin30143000ServiceImpl implements StockKbarMin30143000Service {

    @Autowired
    private StockKbarMin30143000DAO stockKbarMin30143000DAO;

    @Override
    public StockKbarMin30143000 save(StockKbarMin30143000 record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockKbarMin30143000DAO.insert(record);
        return record;
    }

    @Override
    public StockKbarMin30143000 getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockKbarMin30143000DAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockKbarMin30143000 record) {
        Assert.notNull(record, "待更新记录不能为空");
        return stockKbarMin30143000DAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockKbarMin30143000> listByCondition(StockKbarMin30143000Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockKbarMin30143000DAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockKbarMin30143000Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockKbarMin30143000DAO.countByCondition(query);
    }
}