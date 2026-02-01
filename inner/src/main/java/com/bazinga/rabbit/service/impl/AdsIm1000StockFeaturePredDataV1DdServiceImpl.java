package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.AdsIm1000StockFeaturePredDataV1DdDAO;
import com.bazinga.replay.model.AdsIm1000StockFeaturePredDataV1Dd;
import com.bazinga.replay.query.AdsIm1000StockFeaturePredDataV1DdQuery;
import com.bazinga.replay.service.AdsIm1000StockFeaturePredDataV1DdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 〈AdsIm1000StockFeaturePredDataV1Dd Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-08-20
 */
@Service
public class AdsIm1000StockFeaturePredDataV1DdServiceImpl implements AdsIm1000StockFeaturePredDataV1DdService {

    @Autowired
    private AdsIm1000StockFeaturePredDataV1DdDAO adsIm1000StockFeaturePredDataV1DdDAO;

    @Override
    public AdsIm1000StockFeaturePredDataV1Dd save(AdsIm1000StockFeaturePredDataV1Dd record) {
        Assert.notNull(record, "待插入记录不能为空");
        adsIm1000StockFeaturePredDataV1DdDAO.insert(record);
        return record;
    }

    @Override
    public AdsIm1000StockFeaturePredDataV1Dd getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return adsIm1000StockFeaturePredDataV1DdDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(AdsIm1000StockFeaturePredDataV1Dd record) {
        Assert.notNull(record, "待更新记录不能为空");
        return adsIm1000StockFeaturePredDataV1DdDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<AdsIm1000StockFeaturePredDataV1Dd> listByCondition(AdsIm1000StockFeaturePredDataV1DdQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return adsIm1000StockFeaturePredDataV1DdDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(AdsIm1000StockFeaturePredDataV1DdQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return adsIm1000StockFeaturePredDataV1DdDAO.countByCondition(query);
    }
}