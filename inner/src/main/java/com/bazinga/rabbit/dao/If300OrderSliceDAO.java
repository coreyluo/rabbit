package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.If300OrderSlice;
import com.bazinga.replay.query.If300OrderSliceQuery;

import java.util.List;

/**
 * 〈If300OrderSlice DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-21
 */
public interface If300OrderSliceDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(If300OrderSlice record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    If300OrderSlice selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(If300OrderSlice record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<If300OrderSlice> selectByCondition(If300OrderSliceQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(If300OrderSliceQuery query);

}