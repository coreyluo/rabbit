package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.HyStatisticInfoV1;
import com.bazinga.replay.query.HyStatisticInfoV1Query;

import java.util.List;

/**
 * 〈HyStatisticInfoV1 DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-10-15
 */
public interface HyStatisticInfoV1DAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(HyStatisticInfoV1 record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    HyStatisticInfoV1 selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(HyStatisticInfoV1 record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<HyStatisticInfoV1> selectByCondition(HyStatisticInfoV1Query query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(HyStatisticInfoV1Query query);

}