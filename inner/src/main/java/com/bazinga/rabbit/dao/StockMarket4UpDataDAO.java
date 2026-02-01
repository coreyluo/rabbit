package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockMarket4UpData;
import com.bazinga.replay.query.StockMarket4UpDataQuery;

import java.util.List;

/**
 * 〈StockMarket4UpData DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-03-26
 */
public interface StockMarket4UpDataDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockMarket4UpData record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockMarket4UpData selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockMarket4UpData record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockMarket4UpData> selectByCondition(StockMarket4UpDataQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockMarket4UpDataQuery query);

}