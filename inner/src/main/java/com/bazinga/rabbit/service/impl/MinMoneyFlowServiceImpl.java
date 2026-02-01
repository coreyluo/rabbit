package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.MinMoneyFlowDAO;
import com.bazinga.replay.model.MinMoneyFlow;
import com.bazinga.replay.query.MinMoneyFlowQuery;
import com.bazinga.replay.service.MinMoneyFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈MinMoneyFlow Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-10
 */
@Service
public class MinMoneyFlowServiceImpl implements MinMoneyFlowService {

    @Autowired
    private MinMoneyFlowDAO minMoneyFlowDAO;

    @Override
    public MinMoneyFlow save(MinMoneyFlow record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        minMoneyFlowDAO.insert(record);
        return record;
    }

    @Override
    public MinMoneyFlow getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return minMoneyFlowDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(MinMoneyFlow record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return minMoneyFlowDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<MinMoneyFlow> listByCondition(MinMoneyFlowQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return minMoneyFlowDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(MinMoneyFlowQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return minMoneyFlowDAO.countByCondition(query);
    }

    @Override
    public MinMoneyFlow getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return minMoneyFlowDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(MinMoneyFlow record) {
        Assert.notNull(record, "待更新记录不能为空");
        return minMoneyFlowDAO.updateByUniqueKey(record);
    }
}