package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.BtCapitalFlowMinDAO;
import com.bazinga.replay.model.BtCapitalFlowMin;
import com.bazinga.replay.query.BtCapitalFlowMinQuery;
import com.bazinga.replay.service.BtCapitalFlowMinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈BtCapitalFlowMin Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-12-14
 */
@Service
public class BtCapitalFlowMinServiceImpl implements BtCapitalFlowMinService {

    @Autowired
    private BtCapitalFlowMinDAO btCapitalFlowMinDAO;

    @Override
    public BtCapitalFlowMin save(BtCapitalFlowMin record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        btCapitalFlowMinDAO.insert(record);
        return record;
    }

    @Override
    public BtCapitalFlowMin getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return btCapitalFlowMinDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(BtCapitalFlowMin record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return btCapitalFlowMinDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<BtCapitalFlowMin> listByCondition(BtCapitalFlowMinQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return btCapitalFlowMinDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(BtCapitalFlowMinQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return btCapitalFlowMinDAO.countByCondition(query);
    }

    @Override
    public BtCapitalFlowMin getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return btCapitalFlowMinDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(BtCapitalFlowMin record) {
        Assert.notNull(record, "待更新记录不能为空");
        return btCapitalFlowMinDAO.updateByUniqueKey(record);
    }
}