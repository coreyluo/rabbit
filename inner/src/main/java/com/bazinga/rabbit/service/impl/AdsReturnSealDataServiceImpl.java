package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.AdsReturnSealDataDAO;
import com.bazinga.replay.model.AdsReturnSealData;
import com.bazinga.replay.query.AdsReturnSealDataQuery;
import com.bazinga.replay.service.AdsReturnSealDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 〈AdsReturnSealData Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-07-30
 */
@Service
public class AdsReturnSealDataServiceImpl implements AdsReturnSealDataService {

    @Autowired
    private AdsReturnSealDataDAO adsReturnSealDataDAO;

    @Override
    public AdsReturnSealData save(AdsReturnSealData record) {
        Assert.notNull(record, "待插入记录不能为空");
        adsReturnSealDataDAO.insert(record);
        return record;
    }

    @Override
    public AdsReturnSealData getById(Integer id) {
        Assert.notNull(id, "主键不能为空");
        return adsReturnSealDataDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(AdsReturnSealData record) {
        Assert.notNull(record, "待更新记录不能为空");
        return adsReturnSealDataDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<AdsReturnSealData> listByCondition(AdsReturnSealDataQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return adsReturnSealDataDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(AdsReturnSealDataQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return adsReturnSealDataDAO.countByCondition(query);
    }
}