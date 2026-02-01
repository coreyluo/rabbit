package com.bazinga.rabbit.service;

import com.bazinga.replay.model.StockBasicFifteenminuteAdj;
import com.bazinga.replay.query.StockBasicFifteenminuteAdjQuery;

import java.util.List;

/**
 * 〈StockBasicFifteenminuteAdj Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-13
 */
public interface StockBasicFifteenminuteAdjService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockBasicFifteenminuteAdj save(StockBasicFifteenminuteAdj record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockBasicFifteenminuteAdj getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockBasicFifteenminuteAdj record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockBasicFifteenminuteAdj> listByCondition(StockBasicFifteenminuteAdjQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockBasicFifteenminuteAdjQuery query);
}