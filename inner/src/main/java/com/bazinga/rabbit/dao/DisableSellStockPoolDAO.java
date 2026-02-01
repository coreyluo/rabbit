package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.DisableSellStockPool;
import com.bazinga.replay.query.DisableSellStockPoolQuery;

import java.util.List;

/**
 * 〈DisableSellStockPool DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-29
 */
public interface DisableSellStockPoolDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(DisableSellStockPool record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    DisableSellStockPool selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(DisableSellStockPool record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<DisableSellStockPool> selectByCondition(DisableSellStockPoolQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(DisableSellStockPoolQuery query);

}