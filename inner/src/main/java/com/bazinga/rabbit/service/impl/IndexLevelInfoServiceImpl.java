package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.IndexLevelInfoDAO;
import com.bazinga.replay.model.IndexLevelInfo;
import com.bazinga.replay.query.IndexLevelInfoQuery;
import com.bazinga.replay.service.IndexLevelInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈IndexLevelInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-08-26
 */
@Service
public class IndexLevelInfoServiceImpl implements IndexLevelInfoService {

    @Autowired
    private IndexLevelInfoDAO indexLevelInfoDAO;

    @Override
    public IndexLevelInfo save(IndexLevelInfo record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        indexLevelInfoDAO.insert(record);
        return record;
    }

    @Override
    public IndexLevelInfo getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return indexLevelInfoDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(IndexLevelInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return indexLevelInfoDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<IndexLevelInfo> listByCondition(IndexLevelInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return indexLevelInfoDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(IndexLevelInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return indexLevelInfoDAO.countByCondition(query);
    }

    @Override
    public IndexLevelInfo getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return indexLevelInfoDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(IndexLevelInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        return indexLevelInfoDAO.updateByUniqueKey(record);
    }
}