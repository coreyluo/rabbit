package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.IndexLevelInfo;
import com.bazinga.replay.query.IndexLevelInfoQuery;

import java.util.List;

/**
 * 〈IndexLevelInfo DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-08-26
 */
public interface IndexLevelInfoDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(IndexLevelInfo record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    IndexLevelInfo selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(IndexLevelInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<IndexLevelInfo> selectByCondition(IndexLevelInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(IndexLevelInfoQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    IndexLevelInfo selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(IndexLevelInfo record);

}