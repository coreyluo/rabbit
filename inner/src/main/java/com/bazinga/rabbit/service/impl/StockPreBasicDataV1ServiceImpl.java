package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockPreBasicDataV1DAO;
import com.bazinga.replay.model.StockPreBasicDataV1;
import com.bazinga.replay.query.StockPreBasicDataV1Query;
import com.bazinga.replay.service.StockPreBasicDataV1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockPreBasicDataV1 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-20
 */
@Service
public class StockPreBasicDataV1ServiceImpl implements StockPreBasicDataV1Service {

    @Autowired
    private StockPreBasicDataV1DAO stockPreBasicDataV1DAO;

    @Override
    public StockPreBasicDataV1 save(StockPreBasicDataV1 record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockPreBasicDataV1DAO.insert(record);
        return record;
    }

    @Override
    public StockPreBasicDataV1 getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockPreBasicDataV1DAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockPreBasicDataV1 record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return stockPreBasicDataV1DAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockPreBasicDataV1> listByCondition(StockPreBasicDataV1Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockPreBasicDataV1DAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockPreBasicDataV1Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockPreBasicDataV1DAO.countByCondition(query);
    }
}