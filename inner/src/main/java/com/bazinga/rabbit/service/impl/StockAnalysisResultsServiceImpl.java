package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockAnalysisResultsDAO;
import com.bazinga.replay.model.StockAnalysisResults;
import com.bazinga.replay.query.StockAnalysisResultsQuery;
import com.bazinga.replay.service.StockAnalysisResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 〈StockAnalysisResults Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-20
 */
@Service
public class StockAnalysisResultsServiceImpl implements StockAnalysisResultsService {

    @Autowired
    private StockAnalysisResultsDAO stockAnalysisResultsDAO;

    @Override
    public StockAnalysisResults save(StockAnalysisResults record) {
        Assert.notNull(record, "待插入记录不能为空");
        stockAnalysisResultsDAO.insert(record);
        return record;
    }

    @Override
    public StockAnalysisResults getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockAnalysisResultsDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockAnalysisResults record) {
        Assert.notNull(record, "待更新记录不能为空");
        return stockAnalysisResultsDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockAnalysisResults> listByCondition(StockAnalysisResultsQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockAnalysisResultsDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockAnalysisResultsQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockAnalysisResultsDAO.countByCondition(query);
    }
}