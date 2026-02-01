package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.ThsAccountInfoDAO;
import com.bazinga.replay.model.ThsAccountInfo;
import com.bazinga.replay.query.ThsAccountInfoQuery;
import com.bazinga.replay.service.ThsAccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈ThsAccountInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-20
 */
@Service
public class ThsAccountInfoServiceImpl implements ThsAccountInfoService {

    @Autowired
    private ThsAccountInfoDAO thsAccountInfoDAO;

    @Override
    public ThsAccountInfo save(ThsAccountInfo record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        thsAccountInfoDAO.insert(record);
        return record;
    }

    @Override
    public ThsAccountInfo getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return thsAccountInfoDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(ThsAccountInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return thsAccountInfoDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<ThsAccountInfo> listByCondition(ThsAccountInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return thsAccountInfoDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(ThsAccountInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return thsAccountInfoDAO.countByCondition(query);
    }
}