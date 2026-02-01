package com.bazinga.rabbit.service;

import com.bazinga.replay.model.MarketLoverUrl;
import com.bazinga.replay.query.MarketLoverUrlQuery;

import java.util.List;

/**
 * 〈MarketLoverUrl Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-10-20
 */
public interface MarketLoverUrlService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    MarketLoverUrl save(MarketLoverUrl record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    MarketLoverUrl getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(MarketLoverUrl record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MarketLoverUrl> listByCondition(MarketLoverUrlQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(MarketLoverUrlQuery query);
}