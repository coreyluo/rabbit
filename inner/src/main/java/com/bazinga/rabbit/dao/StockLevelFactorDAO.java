package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockLevelFactor;
import com.bazinga.replay.query.StockLevelFactorQuery;

import java.util.List;

/**
 * 〈StockLevelFactor DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-01-04
 */
public interface StockLevelFactorDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockLevelFactor record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockLevelFactor selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockLevelFactor record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockLevelFactor> selectByCondition(StockLevelFactorQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockLevelFactorQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockLevelFactor selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockLevelFactor record);

}