package com.bazinga.rabbit.service;

import com.bazinga.replay.model.HistoryBasicBlockDetail;
import com.bazinga.replay.query.HistoryBasicBlockDetailQuery;

import java.util.List;

/**
 * 〈HistoryBasicBlockDetail Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-10-27
 */
public interface HistoryBasicBlockDetailService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    HistoryBasicBlockDetail save(HistoryBasicBlockDetail record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    HistoryBasicBlockDetail getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(HistoryBasicBlockDetail record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<HistoryBasicBlockDetail> listByCondition(HistoryBasicBlockDetailQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(HistoryBasicBlockDetailQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    HistoryBasicBlockDetail getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(HistoryBasicBlockDetail record);
}