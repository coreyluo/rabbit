package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.MarketStatisticDaily;
import com.bazinga.replay.query.MarketStatisticDailyQuery;

import java.util.List;

/**
 * 〈MarketStatisticDaily DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-10-23
 */
public interface MarketStatisticDailyDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(MarketStatisticDaily record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    MarketStatisticDaily selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(MarketStatisticDaily record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MarketStatisticDaily> selectByCondition(MarketStatisticDailyQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(MarketStatisticDailyQuery query);

    /**
     * 唯一键kbarDate 查询
     *
     * @param kbarDate 查询参数
     */
    MarketStatisticDaily selectByKbarDate(String kbarDate);

    /**
     * 唯一键kbarDate 更新
     *
     * @param record 更新参数
     */
    int updateByKbarDate(MarketStatisticDaily record);

}