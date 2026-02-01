package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.MinStockKbarDAO;
import com.bazinga.replay.model.MinStockKbar;
import com.bazinga.replay.query.MinStockKbarQuery;
import com.bazinga.replay.service.MinStockKbarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈MinStockKbar Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-08-23
 */
@Service
public class MinStockKbarServiceImpl implements MinStockKbarService {

    @Autowired
    private MinStockKbarDAO minStockKbarDAO;

    @Override
    public MinStockKbar save(MinStockKbar record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        minStockKbarDAO.insert(record);
        return record;
    }

    @Override
    public void deleteBatchId(List<MinStockKbar> records) {
        minStockKbarDAO.deleteBatchId(records);
    }

    @Override
    public MinStockKbar getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return minStockKbarDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(MinStockKbar record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return minStockKbarDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<MinStockKbar> listByCondition(MinStockKbarQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return minStockKbarDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(MinStockKbarQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return minStockKbarDAO.countByCondition(query);
    }

    @Override
    public MinStockKbar getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return minStockKbarDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(MinStockKbar record) {
        Assert.notNull(record, "待更新记录不能为空");
        return minStockKbarDAO.updateByUniqueKey(record);
    }
}