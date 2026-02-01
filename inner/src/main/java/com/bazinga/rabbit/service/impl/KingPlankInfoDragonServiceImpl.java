package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.KingPlankInfoDragonDAO;
import com.bazinga.replay.model.KingPlankInfoDragon;
import com.bazinga.replay.query.KingPlankInfoDragonQuery;
import com.bazinga.replay.service.KingPlankInfoDragonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈KingPlankInfoDragon Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-11-10
 */
@Service
public class KingPlankInfoDragonServiceImpl implements KingPlankInfoDragonService {

    @Autowired
    private KingPlankInfoDragonDAO kingPlankInfoDragonDAO;

    @Override
    public KingPlankInfoDragon save(KingPlankInfoDragon record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        kingPlankInfoDragonDAO.insert(record);
        return record;
    }

    @Override
    public KingPlankInfoDragon getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return kingPlankInfoDragonDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(KingPlankInfoDragon record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return kingPlankInfoDragonDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<KingPlankInfoDragon> listByCondition(KingPlankInfoDragonQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return kingPlankInfoDragonDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(KingPlankInfoDragonQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return kingPlankInfoDragonDAO.countByCondition(query);
    }

    @Override
    public KingPlankInfoDragon getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return kingPlankInfoDragonDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(KingPlankInfoDragon record) {
        Assert.notNull(record, "待更新记录不能为空");
        return kingPlankInfoDragonDAO.updateByUniqueKey(record);
    }
}