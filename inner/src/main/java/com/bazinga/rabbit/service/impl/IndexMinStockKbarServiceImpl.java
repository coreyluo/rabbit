package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.IndexMinStockKbarDAO;
import com.bazinga.replay.model.IndexMinStockKbar;
import com.bazinga.replay.query.IndexMinStockKbarQuery;
import com.bazinga.replay.service.IndexMinStockKbarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈IndexMinStockKbar Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-10-15
 */
@Service
public class IndexMinStockKbarServiceImpl implements IndexMinStockKbarService {

    @Autowired
    private IndexMinStockKbarDAO indexMinStockKbarDAO;

    @Override
    public IndexMinStockKbar save(IndexMinStockKbar record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        indexMinStockKbarDAO.insert(record);
        return record;
    }

    @Override
    public IndexMinStockKbar getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return indexMinStockKbarDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(IndexMinStockKbar record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return indexMinStockKbarDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<IndexMinStockKbar> listByCondition(IndexMinStockKbarQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return indexMinStockKbarDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(IndexMinStockKbarQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return indexMinStockKbarDAO.countByCondition(query);
    }

    @Override
    public IndexMinStockKbar getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return indexMinStockKbarDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(IndexMinStockKbar record) {
        Assert.notNull(record, "待更新记录不能为空");
        return indexMinStockKbarDAO.updateByUniqueKey(record);
    }
}