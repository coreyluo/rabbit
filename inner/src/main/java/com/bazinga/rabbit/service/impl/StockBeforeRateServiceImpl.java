package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockBeforeRateDAO;
import com.bazinga.replay.model.StockBeforeRate;
import com.bazinga.replay.query.StockBeforeRateQuery;
import com.bazinga.replay.service.StockBeforeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockBeforeRate Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-12-28
 */
@Service
public class StockBeforeRateServiceImpl implements StockBeforeRateService {

    @Autowired
    private StockBeforeRateDAO stockBeforeRateDAO;

    @Override
    public StockBeforeRate save(StockBeforeRate record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockBeforeRateDAO.insert(record);
        return record;
    }

    @Override
    public StockBeforeRate getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockBeforeRateDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockBeforeRate record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return stockBeforeRateDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockBeforeRate> listByCondition(StockBeforeRateQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockBeforeRateDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockBeforeRateQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockBeforeRateDAO.countByCondition(query);
    }

    @Override
    public StockBeforeRate getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return stockBeforeRateDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(StockBeforeRate record) {
        Assert.notNull(record, "待更新记录不能为空");
        return stockBeforeRateDAO.updateByUniqueKey(record);
    }
}