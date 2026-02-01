package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.MarketLoverParam;
import com.bazinga.replay.query.MarketLoverParamQuery;

import java.util.List;

/**
 * 〈MarketLoverParam DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-10-20
 */
public interface MarketLoverParamDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(MarketLoverParam record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    MarketLoverParam selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(MarketLoverParam record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MarketLoverParam> selectByCondition(MarketLoverParamQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(MarketLoverParamQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    MarketLoverParam selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(MarketLoverParam record);

}