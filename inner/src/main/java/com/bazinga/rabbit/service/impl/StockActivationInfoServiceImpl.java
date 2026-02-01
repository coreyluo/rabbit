package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.StockActivationInfoDAO;
import com.bazinga.replay.model.StockActivationInfo;
import com.bazinga.replay.query.StockActivationInfoQuery;
import com.bazinga.replay.service.StockActivationInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈StockActivationInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-07-24
 */
@Service
public class StockActivationInfoServiceImpl implements StockActivationInfoService {

    @Autowired
    private StockActivationInfoDAO stockActivationInfoDAO;

    @Override
    public StockActivationInfo save(StockActivationInfo record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        stockActivationInfoDAO.insert(record);
        return record;
    }

    @Override
    public StockActivationInfo getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return stockActivationInfoDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(StockActivationInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return stockActivationInfoDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<StockActivationInfo> listByCondition(StockActivationInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockActivationInfoDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(StockActivationInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return stockActivationInfoDAO.countByCondition(query);
    }

    @Override
    public StockActivationInfo getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return stockActivationInfoDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(StockActivationInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        return stockActivationInfoDAO.updateByUniqueKey(record);
    }
}