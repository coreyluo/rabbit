package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockBasicFifteenminuteAdjDAO;
import com.bazinga.replay.model.StockBasicFifteenminuteAdj;
import com.bazinga.replay.query.StockBasicFifteenminuteAdjQuery;
import com.bazinga.replay.service.StockBasicFifteenminuteAdjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 〈StockBasicFifteenminuteAdj Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-13
 */
@Service
public class StockBasicFifteenminuteAdjServiceImpl implements StockBasicFifteenminuteAdjService {

    @Autowired
    private StockBasicFifteenminuteAdjDAO stockBasicFifteenminuteAdjDAO;

    @Override
    public StockBasicFifteenminuteAdj save(StockBasicFifteenminuteAdj record) {
        Assert.notNull(record, "待插入记录不能为空");
        stockBasicFifteenminuteAdjDAO.insert(record);
        return record;
    }

    @Override
    public StockBasicFifteenminuteAdj getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockBasicFifteenminuteAdjDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockBasicFifteenminuteAdj record) {
        Assert.notNull(record, "待更新记录不能为空");
        return stockBasicFifteenminuteAdjDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockBasicFifteenminuteAdj> listByCondition(StockBasicFifteenminuteAdjQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockBasicFifteenminuteAdjDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockBasicFifteenminuteAdjQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockBasicFifteenminuteAdjDAO.countByCondition(query);
    }
}