package com.bazinga.rabbit.service;

import com.bazinga.replay.model.AdsReturnSealData;
import com.bazinga.replay.query.AdsReturnSealDataQuery;

import java.util.List;

/**
 * 〈AdsReturnSealData Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-07-30
 */
public interface AdsReturnSealDataService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    AdsReturnSealData save(AdsReturnSealData record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    AdsReturnSealData getById(Integer id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(AdsReturnSealData record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<AdsReturnSealData> listByCondition(AdsReturnSealDataQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(AdsReturnSealDataQuery query);
}