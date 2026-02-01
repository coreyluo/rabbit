package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.HistoryStock143000;
import com.bazinga.replay.query.HistoryStock143000Query;

import java.util.List;

/**
 * 〈HistoryStock143000 DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-01
 */
public interface HistoryStock143000DAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(HistoryStock143000 record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    HistoryStock143000 selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(HistoryStock143000 record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<HistoryStock143000> selectByCondition(HistoryStock143000Query query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(HistoryStock143000Query query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    HistoryStock143000 selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(HistoryStock143000 record);

}