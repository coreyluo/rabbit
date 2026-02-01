package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.MarketLoverUrl;
import com.bazinga.replay.query.MarketLoverUrlQuery;

import java.util.List;

/**
 * 〈MarketLoverUrl DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-10-20
 */
public interface MarketLoverUrlDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(MarketLoverUrl record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    MarketLoverUrl selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(MarketLoverUrl record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MarketLoverUrl> selectByCondition(MarketLoverUrlQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(MarketLoverUrlQuery query);

}