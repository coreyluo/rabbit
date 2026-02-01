package com.bazinga.rabbit.service;

import com.bazinga.replay.model.HistoryBlockDetail;
import com.bazinga.replay.query.HistoryBlockDetailQuery;

import java.util.List;

/**
 * 〈HistoryBlockDetail Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-12
 */
public interface HistoryBlockDetailService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    HistoryBlockDetail save(HistoryBlockDetail record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    HistoryBlockDetail getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(HistoryBlockDetail record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<HistoryBlockDetail> listByCondition(HistoryBlockDetailQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(HistoryBlockDetailQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    HistoryBlockDetail getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(HistoryBlockDetail record);

    void deleteById(Long id);
}