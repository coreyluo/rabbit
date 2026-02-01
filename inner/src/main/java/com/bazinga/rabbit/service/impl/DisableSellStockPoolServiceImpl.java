package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.DisableSellStockPoolDAO;
import com.bazinga.replay.model.DisableSellStockPool;
import com.bazinga.replay.query.DisableSellStockPoolQuery;
import com.bazinga.replay.service.DisableSellStockPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈DisableSellStockPool Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-29
 */
@Service
public class DisableSellStockPoolServiceImpl implements DisableSellStockPoolService {

    @Autowired
    private DisableSellStockPoolDAO disableSellStockPoolDAO;

    @Override
    public DisableSellStockPool save(DisableSellStockPool record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        disableSellStockPoolDAO.insert(record);
        return record;
    }

    @Override
    public DisableSellStockPool getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return disableSellStockPoolDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(DisableSellStockPool record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return disableSellStockPoolDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<DisableSellStockPool> listByCondition(DisableSellStockPoolQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return disableSellStockPoolDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(DisableSellStockPoolQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return disableSellStockPoolDAO.countByCondition(query);
    }
}