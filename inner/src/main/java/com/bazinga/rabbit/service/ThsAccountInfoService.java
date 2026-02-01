package com.bazinga.rabbit.service;

import com.bazinga.replay.model.ThsAccountInfo;
import com.bazinga.replay.query.ThsAccountInfoQuery;

import java.util.List;

/**
 * 〈ThsAccountInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-20
 */
public interface ThsAccountInfoService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    ThsAccountInfo save(ThsAccountInfo record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    ThsAccountInfo getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(ThsAccountInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<ThsAccountInfo> listByCondition(ThsAccountInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(ThsAccountInfoQuery query);
}