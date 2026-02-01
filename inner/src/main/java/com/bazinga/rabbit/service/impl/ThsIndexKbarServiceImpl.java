package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.ThsIndexKbarDAO;
import com.bazinga.replay.model.ThsIndexKbar;
import com.bazinga.replay.query.ThsIndexKbarQuery;
import com.bazinga.replay.service.ThsIndexKbarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈ThsIndexKbar Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-10-23
 */
@Service
public class ThsIndexKbarServiceImpl implements ThsIndexKbarService {

    @Autowired
    private ThsIndexKbarDAO thsIndexKbarDAO;

    @Override
    public ThsIndexKbar save(ThsIndexKbar record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        thsIndexKbarDAO.insert(record);
        return record;
    }

    @Override
    public ThsIndexKbar getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return thsIndexKbarDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(ThsIndexKbar record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return thsIndexKbarDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<ThsIndexKbar> listByCondition(ThsIndexKbarQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return thsIndexKbarDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(ThsIndexKbarQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return thsIndexKbarDAO.countByCondition(query);
    }

    @Override
    public ThsIndexKbar getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return thsIndexKbarDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(ThsIndexKbar record) {
        Assert.notNull(record, "待更新记录不能为空");
        return thsIndexKbarDAO.updateByUniqueKey(record);
    }
}