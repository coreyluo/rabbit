package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.MinStockKbar;
import com.bazinga.replay.query.MinStockKbarQuery;

import java.util.List;

/**
 * 〈MinStockKbar DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-08-23
 */
public interface MinStockKbarDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(MinStockKbar record);

    void deleteBatchId(List<MinStockKbar> records);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    MinStockKbar selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(MinStockKbar record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MinStockKbar> selectByCondition(MinStockKbarQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(MinStockKbarQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    MinStockKbar selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(MinStockKbar record);

}