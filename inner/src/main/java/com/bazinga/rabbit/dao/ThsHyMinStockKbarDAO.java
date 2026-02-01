package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.ThsHyMinStockKbar;
import com.bazinga.replay.query.ThsHyMinStockKbarQuery;

import java.util.List;

/**
 * 〈ThsHyMinStockKbar DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-11-11
 */
public interface ThsHyMinStockKbarDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(ThsHyMinStockKbar record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    ThsHyMinStockKbar selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(ThsHyMinStockKbar record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<ThsHyMinStockKbar> selectByCondition(ThsHyMinStockKbarQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(ThsHyMinStockKbarQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    ThsHyMinStockKbar selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(ThsHyMinStockKbar record);

}