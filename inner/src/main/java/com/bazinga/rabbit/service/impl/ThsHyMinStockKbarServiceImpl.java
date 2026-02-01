package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.ThsHyMinStockKbarDAO;
import com.bazinga.replay.model.ThsHyMinStockKbar;
import com.bazinga.replay.query.ThsHyMinStockKbarQuery;
import com.bazinga.replay.service.ThsHyMinStockKbarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈ThsHyMinStockKbar Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-11-11
 */
@Service
public class ThsHyMinStockKbarServiceImpl implements ThsHyMinStockKbarService {

    @Autowired
    private ThsHyMinStockKbarDAO thsHyMinStockKbarDAO;

    @Override
    public ThsHyMinStockKbar save(ThsHyMinStockKbar record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        thsHyMinStockKbarDAO.insert(record);
        return record;
    }

    @Override
    public ThsHyMinStockKbar getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return thsHyMinStockKbarDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(ThsHyMinStockKbar record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return thsHyMinStockKbarDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<ThsHyMinStockKbar> listByCondition(ThsHyMinStockKbarQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return thsHyMinStockKbarDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(ThsHyMinStockKbarQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return thsHyMinStockKbarDAO.countByCondition(query);
    }

    @Override
    public ThsHyMinStockKbar getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return thsHyMinStockKbarDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(ThsHyMinStockKbar record) {
        Assert.notNull(record, "待更新记录不能为空");
        return thsHyMinStockKbarDAO.updateByUniqueKey(record);
    }
}