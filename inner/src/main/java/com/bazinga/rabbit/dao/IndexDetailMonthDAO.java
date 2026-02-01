package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.IndexDetailMonth;
import com.bazinga.replay.query.IndexDetailMonthQuery;

import java.util.List;

/**
 * 〈IndexDetailMonth DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-04-05
 */
public interface IndexDetailMonthDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(IndexDetailMonth record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    IndexDetailMonth selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(IndexDetailMonth record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<IndexDetailMonth> selectByCondition(IndexDetailMonthQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(IndexDetailMonthQuery query);

}