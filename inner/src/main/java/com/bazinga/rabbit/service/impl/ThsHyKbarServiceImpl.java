package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.ThsHyKbarDAO;
import com.bazinga.replay.model.ThsHyKbar;
import com.bazinga.replay.query.ThsHyKbarQuery;
import com.bazinga.replay.service.ThsHyKbarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈ThsHyKbar Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-08-22
 */
@Service
public class ThsHyKbarServiceImpl implements ThsHyKbarService {

    @Autowired
    private ThsHyKbarDAO thsHyKbarDAO;

    @Override
    public ThsHyKbar save(ThsHyKbar record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        thsHyKbarDAO.insert(record);
        return record;
    }

    @Override
    public ThsHyKbar getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return thsHyKbarDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(ThsHyKbar record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return thsHyKbarDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<ThsHyKbar> listByCondition(ThsHyKbarQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return thsHyKbarDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(ThsHyKbarQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return thsHyKbarDAO.countByCondition(query);
    }

    @Override
    public ThsHyKbar getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return thsHyKbarDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(ThsHyKbar record) {
        Assert.notNull(record, "待更新记录不能为空");
        return thsHyKbarDAO.updateByUniqueKey(record);
    }
}