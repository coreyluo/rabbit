package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.SliceTradeSumDAO;
import com.bazinga.replay.model.SliceTradeSum;
import com.bazinga.replay.query.SliceTradeSumQuery;
import com.bazinga.replay.service.SliceTradeSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * ��SliceTradeSum Service��<p>
 * ��������ϸ������
 *
 * @author
 * @date 2023-03-21
 */
@Service
public class SliceTradeSumServiceImpl implements SliceTradeSumService {

    @Autowired
    private SliceTradeSumDAO sliceTradeSumDAO;

    @Override
    public SliceTradeSum save(SliceTradeSum record) {
        Assert.notNull(record, "�������¼����Ϊ��");
        record.setCreateTime(new Date());
        sliceTradeSumDAO.insert(record);
        return record;
    }

    @Override
    public SliceTradeSum getById(Long id) {
        Assert.notNull(id, "��������Ϊ��");
        return sliceTradeSumDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(SliceTradeSum record) {
        Assert.notNull(record, "�����¼�¼����Ϊ��");
        record.setUpdateTime(new Date());
        return sliceTradeSumDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<SliceTradeSum> listByCondition(SliceTradeSumQuery query) {
        Assert.notNull(query, "��ѯ��������Ϊ��");
        return sliceTradeSumDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(SliceTradeSumQuery query) {
        Assert.notNull(query, "��ѯ��������Ϊ��");
        return sliceTradeSumDAO.countByCondition(query);
    }

    @Override
    public SliceTradeSum getByKbarDate(String kbarDate) {
        Assert.notNull(kbarDate, "Ψһ������Ϊ��");
        return sliceTradeSumDAO.selectByKbarDate(kbarDate);
    }

    @Override
    public int updateByKbarDate(SliceTradeSum record) {
        Assert.notNull(record, "�����¼�¼����Ϊ��");
        return sliceTradeSumDAO.updateByKbarDate(record);
    }
}