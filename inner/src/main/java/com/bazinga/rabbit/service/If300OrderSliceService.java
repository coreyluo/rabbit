package com.bazinga.rabbit.service;

import com.bazinga.replay.model.If300OrderSlice;
import com.bazinga.replay.query.If300OrderSliceQuery;

import java.util.List;

/**
 * 〈If300OrderSlice Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-21
 */
public interface If300OrderSliceService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    If300OrderSlice save(If300OrderSlice record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    If300OrderSlice getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(If300OrderSlice record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<If300OrderSlice> listByCondition(If300OrderSliceQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(If300OrderSliceQuery query);
}