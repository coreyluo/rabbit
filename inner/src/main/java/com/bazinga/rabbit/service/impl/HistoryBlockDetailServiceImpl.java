package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.HistoryBlockDetailDAO;
import com.bazinga.replay.model.HistoryBlockDetail;
import com.bazinga.replay.query.HistoryBlockDetailQuery;
import com.bazinga.replay.service.HistoryBlockDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈HistoryBlockDetail Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-12
 */
@Service
public class HistoryBlockDetailServiceImpl implements HistoryBlockDetailService {

    @Autowired
    private HistoryBlockDetailDAO historyBlockDetailDAO;

    @Override
    public HistoryBlockDetail save(HistoryBlockDetail record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        historyBlockDetailDAO.insert(record);
        return record;
    }

    @Override
    public HistoryBlockDetail getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return historyBlockDetailDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(HistoryBlockDetail record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return historyBlockDetailDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<HistoryBlockDetail> listByCondition(HistoryBlockDetailQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return historyBlockDetailDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(HistoryBlockDetailQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return historyBlockDetailDAO.countByCondition(query);
    }

    @Override
    public HistoryBlockDetail getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return historyBlockDetailDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(HistoryBlockDetail record) {
        Assert.notNull(record, "待更新记录不能为空");
        return historyBlockDetailDAO.updateByUniqueKey(record);
    }

    @Override
    public void deleteById(Long id) {
        Assert.notNull(id, "主键不能为空");
        historyBlockDetailDAO.deleteByPrimaryKey(id);
    }
}