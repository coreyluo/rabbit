package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockKbar143000;
import com.bazinga.replay.query.StockKbar143000Query;

import java.util.List;

/**
 * 〈StockKbar143000 DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-01
 */
public interface StockKbar143000DAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockKbar143000 record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockKbar143000 selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockKbar143000 record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockKbar143000> selectByCondition(StockKbar143000Query query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockKbar143000Query query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockKbar143000 selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockKbar143000 record);

}