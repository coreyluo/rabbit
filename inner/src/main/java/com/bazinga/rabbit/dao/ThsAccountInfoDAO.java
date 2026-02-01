package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.ThsAccountInfo;
import com.bazinga.replay.query.ThsAccountInfoQuery;

import java.util.List;

/**
 * 〈ThsAccountInfo DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-20
 */
public interface ThsAccountInfoDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(ThsAccountInfo record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    ThsAccountInfo selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(ThsAccountInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<ThsAccountInfo> selectByCondition(ThsAccountInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(ThsAccountInfoQuery query);

}