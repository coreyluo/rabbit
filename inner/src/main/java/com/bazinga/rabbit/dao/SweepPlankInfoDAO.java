package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.SweepPlankInfo;
import com.bazinga.replay.query.SweepPlankInfoQuery;

import java.util.List;

/**
 * 〈SweepPlankInfo DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-11-06
 */
public interface SweepPlankInfoDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(SweepPlankInfo record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    SweepPlankInfo selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(SweepPlankInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<SweepPlankInfo> selectByCondition(SweepPlankInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(SweepPlankInfoQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    SweepPlankInfo selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(SweepPlankInfo record);

}