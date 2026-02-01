package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.AdsReturnSealData;
import com.bazinga.replay.query.AdsReturnSealDataQuery;

import java.util.List;

/**
 * 〈AdsReturnSealData DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-07-30
 */
public interface AdsReturnSealDataDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(AdsReturnSealData record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    AdsReturnSealData selectByPrimaryKey(Integer id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(AdsReturnSealData record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<AdsReturnSealData> selectByCondition(AdsReturnSealDataQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(AdsReturnSealDataQuery query);

}