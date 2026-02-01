package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.ActFactorInfo;
import com.bazinga.replay.query.ActFactorInfoQuery;

import java.util.List;

/**
 * 〈ActFactorInfo DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-08-14
 */
public interface ActFactorInfoDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(ActFactorInfo record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    ActFactorInfo selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(ActFactorInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<ActFactorInfo> selectByCondition(ActFactorInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(ActFactorInfoQuery query);

}