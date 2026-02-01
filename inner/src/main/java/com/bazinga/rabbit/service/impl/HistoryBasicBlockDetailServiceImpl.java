package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.HistoryBasicBlockDetailDAO;
import com.bazinga.replay.model.HistoryBasicBlockDetail;
import com.bazinga.replay.query.HistoryBasicBlockDetailQuery;
import com.bazinga.replay.service.HistoryBasicBlockDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈HistoryBasicBlockDetail Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-10-27
 */
@Service
public class HistoryBasicBlockDetailServiceImpl implements HistoryBasicBlockDetailService {

    @Autowired
    private HistoryBasicBlockDetailDAO historyBasicBlockDetailDAO;

    @Override
    public HistoryBasicBlockDetail save(HistoryBasicBlockDetail record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        historyBasicBlockDetailDAO.insert(record);
        return record;
    }

    @Override
    public HistoryBasicBlockDetail getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return historyBasicBlockDetailDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(HistoryBasicBlockDetail record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return historyBasicBlockDetailDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<HistoryBasicBlockDetail> listByCondition(HistoryBasicBlockDetailQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return historyBasicBlockDetailDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(HistoryBasicBlockDetailQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return historyBasicBlockDetailDAO.countByCondition(query);
    }

    @Override
    public HistoryBasicBlockDetail getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return historyBasicBlockDetailDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(HistoryBasicBlockDetail record) {
        Assert.notNull(record, "待更新记录不能为空");
        return historyBasicBlockDetailDAO.updateByUniqueKey(record);
    }
}