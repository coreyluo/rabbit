package com.bazinga.rabbit.service;

import com.bazinga.replay.model.StockLevelFactor;
import com.bazinga.replay.query.StockLevelFactorQuery;

import java.util.List;

/**
 * 〈StockLevelFactor Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-01-04
 */
public interface StockLevelFactorService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockLevelFactor save(StockLevelFactor record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockLevelFactor getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockLevelFactor record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockLevelFactor> listByCondition(StockLevelFactorQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockLevelFactorQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockLevelFactor getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockLevelFactor record);
}