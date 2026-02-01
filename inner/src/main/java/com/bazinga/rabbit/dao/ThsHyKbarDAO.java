package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.ThsHyKbar;
import com.bazinga.replay.query.ThsHyKbarQuery;

import java.util.List;

/**
 * 〈ThsHyKbar DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-08-22
 */
public interface ThsHyKbarDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(ThsHyKbar record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    ThsHyKbar selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(ThsHyKbar record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<ThsHyKbar> selectByCondition(ThsHyKbarQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(ThsHyKbarQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    ThsHyKbar selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(ThsHyKbar record);

}