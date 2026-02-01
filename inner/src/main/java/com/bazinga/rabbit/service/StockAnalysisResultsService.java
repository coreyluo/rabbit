package com.bazinga.rabbit.service;

import com.bazinga.replay.model.StockAnalysisResults;
import com.bazinga.replay.query.StockAnalysisResultsQuery;

import java.util.List;

/**
 * 〈StockAnalysisResults Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-20
 */
public interface StockAnalysisResultsService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockAnalysisResults save(StockAnalysisResults record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockAnalysisResults getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockAnalysisResults record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockAnalysisResults> listByCondition(StockAnalysisResultsQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockAnalysisResultsQuery query);
}