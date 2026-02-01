package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockProfit;
import com.bazinga.replay.query.StockProfitQuery;

import java.util.List;

/**
 * 〈StockProfit DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-12-12
 */
public interface StockProfitDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockProfit record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockProfit selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockProfit record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockProfit> selectByCondition(StockProfitQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockProfitQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockProfit selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockProfit record);

}