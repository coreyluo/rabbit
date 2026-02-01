package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.OpenInfoDataDAO;
import com.bazinga.replay.model.OpenInfoData;
import com.bazinga.replay.query.OpenInfoDataQuery;
import com.bazinga.replay.service.OpenInfoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈OpenInfoData Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-01-30
 */
@Service
public class OpenInfoDataServiceImpl implements OpenInfoDataService {

    @Autowired
    private OpenInfoDataDAO openInfoDataDAO;

    @Override
    public OpenInfoData save(OpenInfoData record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        openInfoDataDAO.insert(record);
        return record;
    }

    @Override
    public OpenInfoData getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return openInfoDataDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(OpenInfoData record) {
        Assert.notNull(record, "待更新记录不能为空");

        return openInfoDataDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<OpenInfoData> listByCondition(OpenInfoDataQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return openInfoDataDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(OpenInfoDataQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return openInfoDataDAO.countByCondition(query);
    }

    @Override
    public OpenInfoData getByUniqueKey(String uniqueKey) {
        Assert.notNull(uniqueKey, "唯一键不能为空");
        return openInfoDataDAO.selectByUniqueKey(uniqueKey);
    }

    @Override
    public int updateByUniqueKey(OpenInfoData record) {
        Assert.notNull(record, "待更新记录不能为空");
        return openInfoDataDAO.updateByUniqueKey(record);
    }
}