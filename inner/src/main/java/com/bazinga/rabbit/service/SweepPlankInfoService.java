package com.bazinga.rabbit.service;

import com.bazinga.replay.model.SweepPlankInfo;
import com.bazinga.replay.query.SweepPlankInfoQuery;

import java.util.List;

/**
 * 〈SweepPlankInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-11-06
 */
public interface SweepPlankInfoService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    SweepPlankInfo save(SweepPlankInfo record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    SweepPlankInfo getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(SweepPlankInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<SweepPlankInfo> listByCondition(SweepPlankInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(SweepPlankInfoQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    SweepPlankInfo getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(SweepPlankInfo record);
}