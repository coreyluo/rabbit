package com.bazinga.rabbit.service;

import com.bazinga.replay.model.StockMarket4UpData;
import com.bazinga.replay.query.StockMarket4UpDataQuery;

import java.util.List;

/**
 * 〈StockMarket4UpData Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-03-26
 */
public interface StockMarket4UpDataService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockMarket4UpData save(StockMarket4UpData record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockMarket4UpData getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockMarket4UpData record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockMarket4UpData> listByCondition(StockMarket4UpDataQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockMarket4UpDataQuery query);
}