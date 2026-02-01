package com.bazinga.rabbit.service;

import com.bazinga.replay.model.MarketLoverParam;
import com.bazinga.replay.query.MarketLoverParamQuery;

import java.util.List;

/**
 * 〈MarketLoverParam Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-10-20
 */
public interface MarketLoverParamService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    MarketLoverParam save(MarketLoverParam record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    MarketLoverParam getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(MarketLoverParam record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MarketLoverParam> listByCondition(MarketLoverParamQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(MarketLoverParamQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    MarketLoverParam getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(MarketLoverParam record);
}