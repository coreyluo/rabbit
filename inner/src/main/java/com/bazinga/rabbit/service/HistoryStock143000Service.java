package com.bazinga.rabbit.service;

import com.bazinga.replay.model.HistoryStock143000;
import com.bazinga.replay.query.HistoryStock143000Query;

import java.util.List;

/**
 * 〈HistoryStock143000 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-01
 */
public interface HistoryStock143000Service {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    HistoryStock143000 save(HistoryStock143000 record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    HistoryStock143000 getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(HistoryStock143000 record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<HistoryStock143000> listByCondition(HistoryStock143000Query query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(HistoryStock143000Query query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    HistoryStock143000 getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(HistoryStock143000 record);
}