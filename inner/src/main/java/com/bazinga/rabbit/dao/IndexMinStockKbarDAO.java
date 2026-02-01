package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.IndexMinStockKbar;
import com.bazinga.replay.query.IndexMinStockKbarQuery;

import java.util.List;

/**
 * 〈IndexMinStockKbar DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-10-15
 */
public interface IndexMinStockKbarDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(IndexMinStockKbar record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    IndexMinStockKbar selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(IndexMinStockKbar record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<IndexMinStockKbar> selectByCondition(IndexMinStockKbarQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(IndexMinStockKbarQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    IndexMinStockKbar selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(IndexMinStockKbar record);

}