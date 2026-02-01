package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.ActFactorInfoDAO;
import com.bazinga.replay.model.ActFactorInfo;
import com.bazinga.replay.query.ActFactorInfoQuery;
import com.bazinga.replay.service.ActFactorInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈ActFactorInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-08-14
 */
@Service
public class ActFactorInfoServiceImpl implements ActFactorInfoService {

    @Autowired
    private ActFactorInfoDAO actFactorInfoDAO;

    @Override
    public ActFactorInfo save(ActFactorInfo record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        actFactorInfoDAO.insert(record);
        return record;
    }

    @Override
    public ActFactorInfo getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return actFactorInfoDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(ActFactorInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return actFactorInfoDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<ActFactorInfo> listByCondition(ActFactorInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return actFactorInfoDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(ActFactorInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return actFactorInfoDAO.countByCondition(query);
    }
}