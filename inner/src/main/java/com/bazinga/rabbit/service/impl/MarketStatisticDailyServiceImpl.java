package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.MarketStatisticDailyDAO;
import com.bazinga.replay.model.MarketStatisticDaily;
import com.bazinga.replay.query.MarketStatisticDailyQuery;
import com.bazinga.replay.service.MarketStatisticDailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈MarketStatisticDaily Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-10-23
 */
@Service
public class MarketStatisticDailyServiceImpl implements MarketStatisticDailyService {

    @Autowired
    private MarketStatisticDailyDAO marketStatisticDailyDAO;

    @Override
    public MarketStatisticDaily save(MarketStatisticDaily record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        marketStatisticDailyDAO.insert(record);
        return record;
    }

    @Override
    public MarketStatisticDaily getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return marketStatisticDailyDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(MarketStatisticDaily record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return marketStatisticDailyDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<MarketStatisticDaily> listByCondition(MarketStatisticDailyQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return marketStatisticDailyDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(MarketStatisticDailyQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return marketStatisticDailyDAO.countByCondition(query);
    }

    @Override
    public MarketStatisticDaily getByKbarDate(String kbarDate) {
        Assert.notNull(kbarDate, "唯一键不能为空");
        return marketStatisticDailyDAO.selectByKbarDate(kbarDate);
    }

    @Override
    public int updateByKbarDate(MarketStatisticDaily record) {
        Assert.notNull(record, "待更新记录不能为空");
        return marketStatisticDailyDAO.updateByKbarDate(record);
    }
}