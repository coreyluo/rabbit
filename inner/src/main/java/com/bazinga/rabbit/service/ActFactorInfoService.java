package com.bazinga.rabbit.service;

import com.bazinga.replay.model.ActFactorInfo;
import com.bazinga.replay.query.ActFactorInfoQuery;

import java.util.List;

/**
 * 〈ActFactorInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-08-14
 */
public interface ActFactorInfoService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    ActFactorInfo save(ActFactorInfo record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    ActFactorInfo getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(ActFactorInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<ActFactorInfo> listByCondition(ActFactorInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(ActFactorInfoQuery query);
}