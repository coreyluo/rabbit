package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.EtfTradeRecordsDAO;
import com.bazinga.replay.model.EtfTradeRecords;
import com.bazinga.replay.query.EtfTradeRecordsQuery;
import com.bazinga.replay.service.EtfTradeRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 〈EtfTradeRecords Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-11-14
 */
@Service
public class EtfTradeRecordsServiceImpl implements EtfTradeRecordsService {

    @Autowired
    private EtfTradeRecordsDAO etfTradeRecordsDAO;

    @Override
    public EtfTradeRecords save(EtfTradeRecords record) {
        Assert.notNull(record, "待插入记录不能为空");
        etfTradeRecordsDAO.insert(record);
        return record;
    }

    @Override
    public EtfTradeRecords getById(Integer id) {
        Assert.notNull(id, "主键不能为空");
        return etfTradeRecordsDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(EtfTradeRecords record) {
        Assert.notNull(record, "待更新记录不能为空");
        return etfTradeRecordsDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<EtfTradeRecords> listByCondition(EtfTradeRecordsQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return etfTradeRecordsDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(EtfTradeRecordsQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return etfTradeRecordsDAO.countByCondition(query);
    }
}