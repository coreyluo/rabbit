package com.bazinga.rabbit.service;

import com.bazinga.replay.model.StockProfit;
import com.bazinga.replay.query.StockProfitQuery;

import java.util.List;

/**
 * 〈StockProfit Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-12-12
 */
public interface StockProfitService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockProfit save(StockProfit record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockProfit getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockProfit record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockProfit> listByCondition(StockProfitQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockProfitQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockProfit getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockProfit record);
}