package com.bazinga.rabbit.service.impl;

import com.bazinga.replay.dao.BlockBatchBuyPoolDAO;
import com.bazinga.replay.model.BlockBatchBuyPool;
import com.bazinga.replay.query.BlockBatchBuyPoolQuery;
import com.bazinga.replay.service.BlockBatchBuyPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

/**
 * 〈BlockBatchBuyPool Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-26
 */
@Service
public class BlockBatchBuyPoolServiceImpl implements BlockBatchBuyPoolService {

    @Autowired
    private BlockBatchBuyPoolDAO blockBatchBuyPoolDAO;

    @Override
    public BlockBatchBuyPool save(BlockBatchBuyPool record) {
        Assert.notNull(record, "待插入记录不能为空");
        record.setCreateTime(new Date());
        blockBatchBuyPoolDAO.insert(record);
        return record;
    }

    @Override
    public BlockBatchBuyPool getById(Long id) {
        Assert.notNull(id, "主键不能为空");
        return blockBatchBuyPoolDAO.selectByPrimaryKey(id);
    }

    @Override
    public int updateById(BlockBatchBuyPool record) {
        Assert.notNull(record, "待更新记录不能为空");
        record.setUpdateTime(new Date());
        return blockBatchBuyPoolDAO.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<BlockBatchBuyPool> listByCondition(BlockBatchBuyPoolQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return blockBatchBuyPoolDAO.selectByCondition(query);
    }

    @Override
    public int countByCondition(BlockBatchBuyPoolQuery query) {
        Assert.notNull(query, "查询条件不能为空");
        return blockBatchBuyPoolDAO.countByCondition(query);
    }
}