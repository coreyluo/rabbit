package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockProfitAiDAO;
import com.bazinga.replay.model.StockProfitAi;
import com.bazinga.replay.query.StockProfitAiQuery;
import com.bazinga.replay.service.StockProfitAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockProfitAi Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-18
 */
@Service
public class StockProfitAiServiceImpl implements StockProfitAiService {

    @Autowired
    private StockProfitAiDAO stockProfitAiDAO;

    @Override
    public StockProfitAi save(StockProfitAi record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockProfitAiDAO.insert(record);
        return record;
    }

    @Override
    public StockProfitAi getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockProfitAiDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockProfitAi record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return stockProfitAiDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockProfitAi> listByCondition(StockProfitAiQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockProfitAiDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockProfitAiQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockProfitAiDAO.countByCondition(query);
    }

    @Override
    public StockProfitAi getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return stockProfitAiDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(StockProfitAi record) {
        Assert.notNull(record, "待更新记录不能为空");
        return stockProfitAiDAO.updateByUniqueKey(record);
    }
}