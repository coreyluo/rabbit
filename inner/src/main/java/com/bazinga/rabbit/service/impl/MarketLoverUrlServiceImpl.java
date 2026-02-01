package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.MarketLoverUrlDAO;
import com.bazinga.replay.model.MarketLoverUrl;
import com.bazinga.replay.query.MarketLoverUrlQuery;
import com.bazinga.replay.service.MarketLoverUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈MarketLoverUrl Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-10-20
 */
@Service
public class MarketLoverUrlServiceImpl implements MarketLoverUrlService {

    @Autowired
    private MarketLoverUrlDAO marketLoverUrlDAO;

    @Override
    public MarketLoverUrl save(MarketLoverUrl record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        marketLoverUrlDAO.insert(record);
        return record;
    }

    @Override
    public MarketLoverUrl getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return marketLoverUrlDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(MarketLoverUrl record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return marketLoverUrlDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<MarketLoverUrl> listByCondition(MarketLoverUrlQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return marketLoverUrlDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(MarketLoverUrlQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return marketLoverUrlDAO.countByCondition(query);
    }
}