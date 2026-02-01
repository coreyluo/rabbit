package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.EtfTradeRecords;
import com.bazinga.replay.query.EtfTradeRecordsQuery;

import java.util.List;

/**
 * 〈EtfTradeRecords DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-11-14
 */
public interface EtfTradeRecordsDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(EtfTradeRecords record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    EtfTradeRecords selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(EtfTradeRecords record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<EtfTradeRecords> selectByCondition(EtfTradeRecordsQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(EtfTradeRecordsQuery query);

}