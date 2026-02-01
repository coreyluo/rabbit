package com.bazinga.rabbit.service;

import com.bazinga.replay.model.KingPlankInfoDragon;
import com.bazinga.replay.query.KingPlankInfoDragonQuery;

import java.util.List;

/**
 * 〈KingPlankInfoDragon Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-11-10
 */
public interface KingPlankInfoDragonService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    KingPlankInfoDragon save(KingPlankInfoDragon record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    KingPlankInfoDragon getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(KingPlankInfoDragon record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<KingPlankInfoDragon> listByCondition(KingPlankInfoDragonQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(KingPlankInfoDragonQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    KingPlankInfoDragon getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(KingPlankInfoDragon record);
}