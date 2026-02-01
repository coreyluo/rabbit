package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.MoneyFlowDAO;
import com.bazinga.replay.model.MoneyFlow;
import com.bazinga.replay.query.MoneyFlowQuery;
import com.bazinga.replay.service.MoneyFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈MoneyFlow Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-10
 */
@Service
public class MoneyFlowServiceImpl implements MoneyFlowService {

    @Autowired
    private MoneyFlowDAO moneyFlowDAO;

    @Override
    public MoneyFlow save(MoneyFlow record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        moneyFlowDAO.insert(record);
        return record;
    }

    @Override
    public MoneyFlow getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return moneyFlowDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(MoneyFlow record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return moneyFlowDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<MoneyFlow> listByCondition(MoneyFlowQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return moneyFlowDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(MoneyFlowQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return moneyFlowDAO.countByCondition(query);
    }

    @Override
    public MoneyFlow getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return moneyFlowDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(MoneyFlow record) {
        Assert.notNull(record, "待更新记录不能为空");
        return moneyFlowDAO.updateByUniqueKey(record);
    }
}