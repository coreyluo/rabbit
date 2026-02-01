package com.bazinga.rabbit.service;

import com.bazinga.replay.model.BtCapitalFlowMin;
import com.bazinga.replay.query.BtCapitalFlowMinQuery;

import java.util.List;

/**
 * 〈BtCapitalFlowMin Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-12-14
 */
public interface BtCapitalFlowMinService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    BtCapitalFlowMin save(BtCapitalFlowMin record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    BtCapitalFlowMin getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(BtCapitalFlowMin record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<BtCapitalFlowMin> listByCondition(BtCapitalFlowMinQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(BtCapitalFlowMinQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    BtCapitalFlowMin getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(BtCapitalFlowMin record);
}