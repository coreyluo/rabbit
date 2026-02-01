package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockProfitAi;
import com.bazinga.replay.query.StockProfitAiQuery;

import java.util.List;

/**
 * 〈StockProfitAi DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-18
 */
public interface StockProfitAiDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockProfitAi record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockProfitAi selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockProfitAi record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockProfitAi> selectByCondition(StockProfitAiQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockProfitAiQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockProfitAi selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockProfitAi record);

}