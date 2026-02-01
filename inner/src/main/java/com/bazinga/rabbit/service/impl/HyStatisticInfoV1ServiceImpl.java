package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.HyStatisticInfoV1DAO;
import com.bazinga.replay.model.HyStatisticInfoV1;
import com.bazinga.replay.query.HyStatisticInfoV1Query;
import com.bazinga.replay.service.HyStatisticInfoV1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈HyStatisticInfoV1 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-10-15
 */
@Service
public class HyStatisticInfoV1ServiceImpl implements HyStatisticInfoV1Service {

    @Autowired
    private HyStatisticInfoV1DAO hyStatisticInfoV1DAO;

    @Override
    public HyStatisticInfoV1 save(HyStatisticInfoV1 record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        hyStatisticInfoV1DAO.insert(record);
        return record;
    }

    @Override
    public HyStatisticInfoV1 getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return hyStatisticInfoV1DAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(HyStatisticInfoV1 record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return hyStatisticInfoV1DAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<HyStatisticInfoV1> listByCondition(HyStatisticInfoV1Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return hyStatisticInfoV1DAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(HyStatisticInfoV1Query query) {
        Assert.notNull(query, "查询条件不能为空");
        return hyStatisticInfoV1DAO.countByCondition(query);
    }
}