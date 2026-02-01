package com.bazinga.rabbit.service;

import com.bazinga.replay.model.EtfTradeRecords;
import com.bazinga.replay.query.EtfTradeRecordsQuery;

import java.util.List;

/**
 * 〈EtfTradeRecords Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-11-14
 */
public interface EtfTradeRecordsService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    EtfTradeRecords save(EtfTradeRecords record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    EtfTradeRecords getById(Integer id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(EtfTradeRecords record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<EtfTradeRecords> listByCondition(EtfTradeRecordsQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(EtfTradeRecordsQuery query);
}