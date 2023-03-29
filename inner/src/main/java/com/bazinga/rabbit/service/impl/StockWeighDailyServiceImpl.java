package com.bazinga.rabbit.service.impl;

import com.bazinga.rabbit.dao.StockWeighDailyDAO;
import com.bazinga.rabbit.model.StockWeighDaily;
import com.bazinga.rabbit.query.StockWeighDailyQuery;
import com.bazinga.rabbit.service.StockWeighDailyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockWeighDaily Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-28
 */
@Service
public class StockWeighDailyServiceImpl implements StockWeighDailyService {

    @Autowired
    private StockWeighDailyDAO stockWeighDailyDAO;

    @Override
    public StockWeighDaily save(StockWeighDaily record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockWeighDailyDAO.insert(record);
        return record;
    }

    @Override
    public StockWeighDaily getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockWeighDailyDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockWeighDaily record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return stockWeighDailyDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockWeighDaily> listByCondition(StockWeighDailyQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockWeighDailyDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockWeighDailyQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockWeighDailyDAO.countByCondition(query);
    }
}