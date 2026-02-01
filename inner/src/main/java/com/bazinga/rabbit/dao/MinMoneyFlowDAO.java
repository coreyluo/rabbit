package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.MinMoneyFlow;
import com.bazinga.replay.query.MinMoneyFlowQuery;

import java.util.List;

/**
 * 〈MinMoneyFlow DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-10
 */
public interface MinMoneyFlowDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(MinMoneyFlow record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    MinMoneyFlow selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(MinMoneyFlow record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MinMoneyFlow> selectByCondition(MinMoneyFlowQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(MinMoneyFlowQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    MinMoneyFlow selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(MinMoneyFlow record);

}