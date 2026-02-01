package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockAnalysisResults;
import com.bazinga.replay.query.StockAnalysisResultsQuery;

import java.util.List;

/**
 * 〈StockAnalysisResults DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-20
 */
public interface StockAnalysisResultsDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockAnalysisResults record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockAnalysisResults selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockAnalysisResults record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockAnalysisResults> selectByCondition(StockAnalysisResultsQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockAnalysisResultsQuery query);

}