package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockBasicFifteenminuteAdj;
import com.bazinga.replay.query.StockBasicFifteenminuteAdjQuery;

import java.util.List;

/**
 * 〈StockBasicFifteenminuteAdj DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-13
 */
public interface StockBasicFifteenminuteAdjDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockBasicFifteenminuteAdj record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockBasicFifteenminuteAdj selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockBasicFifteenminuteAdj record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockBasicFifteenminuteAdj> selectByCondition(StockBasicFifteenminuteAdjQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockBasicFifteenminuteAdjQuery query);

}