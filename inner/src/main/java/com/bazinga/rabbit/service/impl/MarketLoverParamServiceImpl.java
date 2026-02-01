package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.MarketLoverParamDAO;
import com.bazinga.replay.model.MarketLoverParam;
import com.bazinga.replay.query.MarketLoverParamQuery;
import com.bazinga.replay.service.MarketLoverParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈MarketLoverParam Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-10-20
 */
@Service
public class MarketLoverParamServiceImpl implements MarketLoverParamService {

    @Autowired
    private MarketLoverParamDAO marketLoverParamDAO;

    @Override
    public MarketLoverParam save(MarketLoverParam record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        marketLoverParamDAO.insert(record);
        return record;
    }

    @Override
    public MarketLoverParam getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return marketLoverParamDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(MarketLoverParam record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return marketLoverParamDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<MarketLoverParam> listByCondition(MarketLoverParamQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return marketLoverParamDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(MarketLoverParamQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return marketLoverParamDAO.countByCondition(query);
    }

    @Override
    public MarketLoverParam getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return marketLoverParamDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(MarketLoverParam record) {
        Assert.notNull(record, "待更新记录不能为空");
        return marketLoverParamDAO.updateByUniqueKey(record);
    }
}