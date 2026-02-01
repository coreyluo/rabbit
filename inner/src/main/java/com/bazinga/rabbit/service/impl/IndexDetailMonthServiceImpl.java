package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.IndexDetailMonthDAO;
import com.bazinga.replay.model.IndexDetailMonth;
import com.bazinga.replay.query.IndexDetailMonthQuery;
import com.bazinga.replay.service.IndexDetailMonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈IndexDetailMonth Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-04-05
 */
@Service
public class IndexDetailMonthServiceImpl implements IndexDetailMonthService {

    @Autowired
    private IndexDetailMonthDAO indexDetailMonthDAO;

    @Override
    public IndexDetailMonth save(IndexDetailMonth record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        indexDetailMonthDAO.insert(record);
        return record;
    }

    @Override
    public IndexDetailMonth getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return indexDetailMonthDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(IndexDetailMonth record) {
        Assert.notNull(record, "待更新记录不能为空");
        return indexDetailMonthDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<IndexDetailMonth> listByCondition(IndexDetailMonthQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return indexDetailMonthDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(IndexDetailMonthQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return indexDetailMonthDAO.countByCondition(query);
    }
}