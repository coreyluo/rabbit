package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.IndexBeforeRateDAO;
import com.bazinga.replay.model.IndexBeforeRate;
import com.bazinga.replay.query.IndexBeforeRateQuery;
import com.bazinga.replay.service.IndexBeforeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈IndexBeforeRate Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-10-23
 */
@Service
public class IndexBeforeRateServiceImpl implements IndexBeforeRateService {

    @Autowired
    private IndexBeforeRateDAO indexBeforeRateDAO;

    @Override
    public IndexBeforeRate save(IndexBeforeRate record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        indexBeforeRateDAO.insert(record);
        return record;
    }

    @Override
    public IndexBeforeRate getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return indexBeforeRateDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(IndexBeforeRate record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return indexBeforeRateDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<IndexBeforeRate> listByCondition(IndexBeforeRateQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return indexBeforeRateDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(IndexBeforeRateQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return indexBeforeRateDAO.countByCondition(query);
    }

    @Override
    public IndexBeforeRate getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return indexBeforeRateDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(IndexBeforeRate record) {
        Assert.notNull(record, "待更新记录不能为空");
        return indexBeforeRateDAO.updateByUniqueKey(record);
    }
}