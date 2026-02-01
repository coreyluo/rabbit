package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.If300OrderSliceDAO;
import com.bazinga.replay.model.If300OrderSlice;
import com.bazinga.replay.query.If300OrderSliceQuery;
import com.bazinga.replay.service.If300OrderSliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 〈If300OrderSlice Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-21
 */
@Service
public class If300OrderSliceServiceImpl implements If300OrderSliceService {

    @Autowired
    private If300OrderSliceDAO if300OrderSliceDAO;

    @Override
    public If300OrderSlice save(If300OrderSlice record) {
        Assert.notNull(record, "待插入记录不能为空");
        if300OrderSliceDAO.insert(record);
        return record;
    }

    @Override
    public If300OrderSlice getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return if300OrderSliceDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(If300OrderSlice record) {
        Assert.notNull(record, "待更新记录不能为空");
        return if300OrderSliceDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<If300OrderSlice> listByCondition(If300OrderSliceQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return if300OrderSliceDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(If300OrderSliceQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return if300OrderSliceDAO.countByCondition(query);
    }
}