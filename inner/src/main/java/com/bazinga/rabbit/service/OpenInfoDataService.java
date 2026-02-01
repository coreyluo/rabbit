package com.bazinga.rabbit.service;

import com.bazinga.replay.model.OpenInfoData;
import com.bazinga.replay.query.OpenInfoDataQuery;

import java.util.List;

/**
 * 〈OpenInfoData Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-01-30
 */
public interface OpenInfoDataService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    OpenInfoData save(OpenInfoData record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    OpenInfoData getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(OpenInfoData record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<OpenInfoData> listByCondition(OpenInfoDataQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(OpenInfoDataQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    OpenInfoData getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(OpenInfoData record);
}