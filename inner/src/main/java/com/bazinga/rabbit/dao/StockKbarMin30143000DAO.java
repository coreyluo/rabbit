package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockKbarMin30143000;
import com.bazinga.replay.query.StockKbarMin30143000Query;

import java.util.List;

/**
 * 〈StockKbarMin30143000 DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-03
 */
public interface StockKbarMin30143000DAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockKbarMin30143000 record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockKbarMin30143000 selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockKbarMin30143000 record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockKbarMin30143000> selectByCondition(StockKbarMin30143000Query query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockKbarMin30143000Query query);

}