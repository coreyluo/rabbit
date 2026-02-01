package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.GatherBuySellInfoDAO;
import com.bazinga.replay.model.GatherBuySellInfo;
import com.bazinga.replay.query.GatherBuySellInfoQuery;
import com.bazinga.replay.service.GatherBuySellInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈GatherBuySellInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-26
 */
@Service
public class GatherBuySellInfoServiceImpl implements GatherBuySellInfoService {

    @Autowired
    private GatherBuySellInfoDAO gatherBuySellInfoDAO;

    @Override
    public GatherBuySellInfo save(GatherBuySellInfo record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        gatherBuySellInfoDAO.insert(record);
        return record;
    }

    @Override
    public GatherBuySellInfo getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return gatherBuySellInfoDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(GatherBuySellInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return gatherBuySellInfoDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<GatherBuySellInfo> listByCondition(GatherBuySellInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return gatherBuySellInfoDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(GatherBuySellInfoQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return gatherBuySellInfoDAO.countByCondition(query);
    }

    @Override
    public GatherBuySellInfo getByKbarDate(String kbarDate) {
        Assert.notNull(kbarDate, "唯一键不能为空");
        return gatherBuySellInfoDAO.selectByKbarDate(kbarDate);
    }

    @Override
    public int updateByKbarDate(GatherBuySellInfo record) {
        Assert.notNull(record, "待更新记录不能为空");
        return gatherBuySellInfoDAO.updateByKbarDate(record);
    }
}