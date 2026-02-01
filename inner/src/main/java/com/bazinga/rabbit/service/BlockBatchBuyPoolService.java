package com.bazinga.rabbit.service;

import com.bazinga.replay.model.BlockBatchBuyPool;
import com.bazinga.replay.query.BlockBatchBuyPoolQuery;

import java.util.List;

/**
 * 〈BlockBatchBuyPool Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-26
 */
public interface BlockBatchBuyPoolService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    BlockBatchBuyPool save(BlockBatchBuyPool record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    BlockBatchBuyPool getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(BlockBatchBuyPool record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<BlockBatchBuyPool> listByCondition(BlockBatchBuyPoolQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(BlockBatchBuyPoolQuery query);
}