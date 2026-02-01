package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockActivationInfo;
import com.bazinga.replay.query.StockActivationInfoQuery;

import java.util.List;

/**
 * 〈StockActivationInfo DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-07-24
 */
public interface StockActivationInfoDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockActivationInfo record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockActivationInfo selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockActivationInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockActivationInfo> selectByCondition(StockActivationInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockActivationInfoQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    StockActivationInfo selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(StockActivationInfo record);

}