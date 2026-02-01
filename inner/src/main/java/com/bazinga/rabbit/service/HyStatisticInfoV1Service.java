package com.bazinga.rabbit.service;

import com.bazinga.replay.model.HyStatisticInfoV1;
import com.bazinga.replay.query.HyStatisticInfoV1Query;

import java.util.List;

/**
 * 〈HyStatisticInfoV1 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-10-15
 */
public interface HyStatisticInfoV1Service {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    HyStatisticInfoV1 save(HyStatisticInfoV1 record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    HyStatisticInfoV1 getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(HyStatisticInfoV1 record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<HyStatisticInfoV1> listByCondition(HyStatisticInfoV1Query query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(HyStatisticInfoV1Query query);
}