package com.bazinga.rabbit.service;

import com.bazinga.replay.model.MarketStatisticDaily;
import com.bazinga.replay.query.MarketStatisticDailyQuery;

import java.util.List;

/**
 * 〈MarketStatisticDaily Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-10-23
 */
public interface MarketStatisticDailyService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    MarketStatisticDaily save(MarketStatisticDaily record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    MarketStatisticDaily getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(MarketStatisticDaily record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MarketStatisticDaily> listByCondition(MarketStatisticDailyQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(MarketStatisticDailyQuery query);

    /**
     * 唯一键kbarDate 查询
     *
     * @param kbarDate 查询参数
     */
    MarketStatisticDaily getByKbarDate(String kbarDate);

    /**
     * 唯一键kbarDate 更新
     *
     * @param record 更新参数
     */
    int updateByKbarDate(MarketStatisticDaily record);
}