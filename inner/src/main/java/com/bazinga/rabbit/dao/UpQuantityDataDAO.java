package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.UpQuantityData;
import com.bazinga.replay.query.UpQuantityDataQuery;

import java.util.List;

/**
 * 〈UpQuantityData DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-04-08
 */
public interface UpQuantityDataDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(UpQuantityData record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    UpQuantityData selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(UpQuantityData record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<UpQuantityData> selectByCondition(UpQuantityDataQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(UpQuantityDataQuery query);

}