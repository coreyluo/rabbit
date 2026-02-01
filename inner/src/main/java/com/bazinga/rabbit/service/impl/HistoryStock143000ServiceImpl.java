package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.HistoryStock143000DAO;
import com.bazinga.replay.model.HistoryStock143000;
import com.bazinga.replay.query.HistoryStock143000Query;
import com.bazinga.replay.service.HistoryStock143000Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈HistoryStock143000 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-01
 */
@Service
public class HistoryStock143000ServiceImpl implements HistoryStock143000Service {

    @Autowired
    private HistoryStock143000DAO historyStock143000DAO;

    @Override
    public HistoryStock143000 save(HistoryStock143000 record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        historyStock143000DAO.insert(record);
        return record;
    }

    @Override
    public HistoryStock143000 getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return historyStock143000DAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(HistoryStock143000 record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return historyStock143000DAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<HistoryStock143000> listByCondition(HistoryStock143000Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return historyStock143000DAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(HistoryStock143000Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return historyStock143000DAO.countByCondition(query);
    }

    @Override
    public HistoryStock143000 getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return historyStock143000DAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(HistoryStock143000 record) {
        Assert.notNull(record, "待更新记录不能为空");
        return historyStock143000DAO.updateByUniqueKey(record);
    }
}