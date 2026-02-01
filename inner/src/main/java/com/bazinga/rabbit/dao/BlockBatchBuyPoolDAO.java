package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.BlockBatchBuyPool;
import com.bazinga.replay.query.BlockBatchBuyPoolQuery;

import java.util.List;

/**
 * 〈BlockBatchBuyPool DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-26
 */
public interface BlockBatchBuyPoolDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(BlockBatchBuyPool record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    BlockBatchBuyPool selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(BlockBatchBuyPool record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<BlockBatchBuyPool> selectByCondition(BlockBatchBuyPoolQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(BlockBatchBuyPoolQuery query);

}