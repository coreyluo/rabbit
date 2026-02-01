package com.bazinga.rabbit.service;

import com.bazinga.replay.model.StockProfitInfo;
import com.bazinga.replay.query.StockProfitInfoQuery;

import java.util.List;

/**
 * 〈StockProfitInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2026-01-12
 */
public interface StockProfitInfoService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockProfitInfo save(StockProfitInfo record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockProfitInfo getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockProfitInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockProfitInfo> listByCondition(StockProfitInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockProfitInfoQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockProfitInfo getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockProfitInfo record);
}