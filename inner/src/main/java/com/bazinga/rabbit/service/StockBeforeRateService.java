package com.bazinga.rabbit.service;

import com.bazinga.replay.model.StockBeforeRate;
import com.bazinga.replay.query.StockBeforeRateQuery;

import java.util.List;

/**
 * 〈StockBeforeRate Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-12-28
 */
public interface StockBeforeRateService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockBeforeRate save(StockBeforeRate record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockBeforeRate getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockBeforeRate record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockBeforeRate> listByCondition(StockBeforeRateQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockBeforeRateQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockBeforeRate getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockBeforeRate record);
}