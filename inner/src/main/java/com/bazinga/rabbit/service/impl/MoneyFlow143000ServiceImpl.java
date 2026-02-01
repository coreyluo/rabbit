package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.MoneyFlow143000DAO;
import com.bazinga.replay.model.MoneyFlow143000;
import com.bazinga.replay.query.MoneyFlow143000Query;
import com.bazinga.replay.service.MoneyFlow143000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈MoneyFlow143000 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-12
 */
@Service
public class MoneyFlow143000ServiceImpl implements MoneyFlow143000Service {

    @Autowired
    private MoneyFlow143000DAO moneyFlow143000DAO;

    @Override
    public MoneyFlow143000 save(MoneyFlow143000 record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        moneyFlow143000DAO.insert(record);
        return record;
    }

    @Override
    public MoneyFlow143000 getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return moneyFlow143000DAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(MoneyFlow143000 record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return moneyFlow143000DAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<MoneyFlow143000> listByCondition(MoneyFlow143000Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return moneyFlow143000DAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(MoneyFlow143000Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return moneyFlow143000DAO.countByCondition(query);
    }

    @Override
    public MoneyFlow143000 getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return moneyFlow143000DAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(MoneyFlow143000 record) {
        Assert.notNull(record, "待更新记录不能为空");
        return moneyFlow143000DAO.updateByUniqueKey(record);
    }
}