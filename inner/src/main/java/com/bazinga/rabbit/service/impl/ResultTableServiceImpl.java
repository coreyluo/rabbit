package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.ResultTableDAO;
import com.bazinga.replay.model.ResultTable;
import com.bazinga.replay.query.ResultTableQuery;
import com.bazinga.replay.service.ResultTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 〈ResultTable Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-20
 */
@Service
public class ResultTableServiceImpl implements ResultTableService {

    @Autowired
    private ResultTableDAO resultTableDAO;

    @Override
    public ResultTable save(ResultTable record) {
        Assert.notNull(record, "待插入记录不能为空");
        resultTableDAO.insert(record);
        return record;
    }

    @Override
    public ResultTable getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return resultTableDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(ResultTable record) {
        Assert.notNull(record, "待更新记录不能为空");
        return resultTableDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<ResultTable> listByCondition(ResultTableQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return resultTableDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(ResultTableQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return resultTableDAO.countByCondition(query);
    }
}