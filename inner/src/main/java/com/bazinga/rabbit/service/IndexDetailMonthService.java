package com.bazinga.rabbit.service;

import com.bazinga.replay.model.IndexDetailMonth;
import com.bazinga.replay.query.IndexDetailMonthQuery;

import java.util.List;

/**
 * 〈IndexDetailMonth Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-04-05
 */
public interface IndexDetailMonthService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    IndexDetailMonth save(IndexDetailMonth record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    IndexDetailMonth getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(IndexDetailMonth record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<IndexDetailMonth> listByCondition(IndexDetailMonthQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(IndexDetailMonthQuery query);
}