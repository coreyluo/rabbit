package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.SweepPlankInfoDAO;
import com.bazinga.replay.model.SweepPlankInfo;
import com.bazinga.replay.query.SweepPlankInfoQuery;
import com.bazinga.replay.service.SweepPlankInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈SweepPlankInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-11-06
 */
@Service
public class SweepPlankInfoServiceImpl implements SweepPlankInfoService {

    @Autowired
    private SweepPlankInfoDAO sweepPlankInfoDAO;

    @Override
    public SweepPlankInfo save(SweepPlankInfo record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        sweepPlankInfoDAO.insert(record);
        return record;
    }

    @Override
    public SweepPlankInfo getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return sweepPlankInfoDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(SweepPlankInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return sweepPlankInfoDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<SweepPlankInfo> listByCondition(SweepPlankInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return sweepPlankInfoDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(SweepPlankInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return sweepPlankInfoDAO.countByCondition(query);
    }

    @Override
    public SweepPlankInfo getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return sweepPlankInfoDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(SweepPlankInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        return sweepPlankInfoDAO.updateByUniqueKey(record);
    }
}