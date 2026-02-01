package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.UpQuantityDataDAO;
import com.bazinga.replay.model.UpQuantityData;
import com.bazinga.replay.query.UpQuantityDataQuery;
import com.bazinga.replay.service.UpQuantityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈UpQuantityData Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-04-08
 */
@Service
public class UpQuantityDataServiceImpl implements UpQuantityDataService {

    @Autowired
    private UpQuantityDataDAO upQuantityDataDAO;

    @Override
    public UpQuantityData save(UpQuantityData record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        upQuantityDataDAO.insert(record);
        return record;
    }

    @Override
    public UpQuantityData getById(Integer id) {
        Assert.notNull(id, "主键不能为空");
        return upQuantityDataDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(UpQuantityData record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return upQuantityDataDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<UpQuantityData> listByCondition(UpQuantityDataQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return upQuantityDataDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(UpQuantityDataQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return upQuantityDataDAO.countByCondition(query);
    }
}