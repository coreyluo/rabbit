package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.ResultTable;
import com.bazinga.replay.query.ResultTableQuery;

import java.util.List;

/**
 * 〈ResultTable DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-20
 */
public interface ResultTableDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(ResultTable record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    ResultTable selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(ResultTable record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<ResultTable> selectByCondition(ResultTableQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(ResultTableQuery query);

}