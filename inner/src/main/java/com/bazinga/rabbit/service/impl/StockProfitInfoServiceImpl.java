package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockProfitInfoDAO;
import com.bazinga.replay.model.StockProfitInfo;
import com.bazinga.replay.query.StockProfitInfoQuery;
import com.bazinga.replay.service.StockProfitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockProfitInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2026-01-12
 */
@Service
public class StockProfitInfoServiceImpl implements StockProfitInfoService {

    @Autowired
    private StockProfitInfoDAO stockProfitInfoDAO;

    @Override
    public StockProfitInfo save(StockProfitInfo record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockProfitInfoDAO.insert(record);
        return record;
    }

    @Override
    public StockProfitInfo getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockProfitInfoDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockProfitInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return stockProfitInfoDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockProfitInfo> listByCondition(StockProfitInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockProfitInfoDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockProfitInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockProfitInfoDAO.countByCondition(query);
    }

    @Override
    public StockProfitInfo getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return stockProfitInfoDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(StockProfitInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        return stockProfitInfoDAO.updateByUniqueKey(record);
    }
}