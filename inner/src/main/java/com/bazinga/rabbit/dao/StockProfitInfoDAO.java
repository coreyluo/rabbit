package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockProfitInfo;
import com.bazinga.replay.query.StockProfitInfoQuery;

import java.util.List;

/**
 * 〈StockProfitInfo DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2026-01-12
 */
public interface StockProfitInfoDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockProfitInfo record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockProfitInfo selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockProfitInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockProfitInfo> selectByCondition(StockProfitInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockProfitInfoQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockProfitInfo selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockProfitInfo record);

}