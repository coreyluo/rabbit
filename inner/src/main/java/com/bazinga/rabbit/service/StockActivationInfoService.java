package com.bazinga.rabbit.service;

import com.bazinga.replay.model.StockActivationInfo;
import com.bazinga.replay.query.StockActivationInfoQuery;

import java.util.List;

/**
 * 〈StockActivationInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-07-24
 */
public interface StockActivationInfoService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockActivationInfo save(StockActivationInfo record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockActivationInfo getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockActivationInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockActivationInfo> listByCondition(StockActivationInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockActivationInfoQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockActivationInfo getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockActivationInfo record);
}