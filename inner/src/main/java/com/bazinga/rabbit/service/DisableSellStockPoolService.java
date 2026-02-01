package com.bazinga.rabbit.service;

import com.bazinga.replay.model.DisableSellStockPool;
import com.bazinga.replay.query.DisableSellStockPoolQuery;

import java.util.List;

/**
 * 〈DisableSellStockPool Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-29
 */
public interface DisableSellStockPoolService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    DisableSellStockPool save(DisableSellStockPool record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    DisableSellStockPool getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(DisableSellStockPool record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<DisableSellStockPool> listByCondition(DisableSellStockPoolQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(DisableSellStockPoolQuery query);
}