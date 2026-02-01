package com.bazinga.rabbit.service;

import com.bazinga.replay.model.IndexLevelInfo;
import com.bazinga.replay.query.IndexLevelInfoQuery;

import java.util.List;

/**
 * 〈IndexLevelInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-08-26
 */
public interface IndexLevelInfoService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    IndexLevelInfo save(IndexLevelInfo record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    IndexLevelInfo getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(IndexLevelInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<IndexLevelInfo> listByCondition(IndexLevelInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(IndexLevelInfoQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    IndexLevelInfo getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(IndexLevelInfo record);
}