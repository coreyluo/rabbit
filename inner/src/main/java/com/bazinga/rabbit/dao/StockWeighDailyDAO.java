package com.bazinga.rabbit.dao;

import com.bazinga.rabbit.model.StockWeighDaily;
import com.bazinga.rabbit.query.StockWeighDailyQuery;

import java.util.List;

/**
 * 〈StockWeighDaily DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-28
 */
public interface StockWeighDailyDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockWeighDaily record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockWeighDaily selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockWeighDaily record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockWeighDaily> selectByCondition(StockWeighDailyQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockWeighDailyQuery query);

}