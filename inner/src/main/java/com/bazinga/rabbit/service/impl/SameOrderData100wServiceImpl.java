package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.SameOrderData100wDAO;
import com.bazinga.replay.model.SameOrderData100w;
import com.bazinga.replay.query.SameOrderData100wQuery;
import com.bazinga.replay.service.SameOrderData100wService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 〈SameOrderData100w Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-11-21
 */
@Service
public class SameOrderData100wServiceImpl implements SameOrderData100wService {

    @Autowired
    private SameOrderData100wDAO sameOrderData100wDAO;

    @Override
    public SameOrderData100w save(SameOrderData100w record) {
        Assert.notNull(record, "待插入记录不能为空");
        sameOrderData100wDAO.insert(record);
        return record;
    }

    @Override
    public SameOrderData100w getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return sameOrderData100wDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(SameOrderData100w record) {
        Assert.notNull(record, "待更新记录不能为空");

        return sameOrderData100wDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<SameOrderData100w> listByCondition(SameOrderData100wQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return sameOrderData100wDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(SameOrderData100wQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return sameOrderData100wDAO.countByCondition(query);
    }

    @Override
    public SameOrderData100w getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return sameOrderData100wDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(SameOrderData100w record) {
        Assert.notNull(record, "待更新记录不能为空");
        return sameOrderData100wDAO.updateByUniqueKey(record);
    }
}