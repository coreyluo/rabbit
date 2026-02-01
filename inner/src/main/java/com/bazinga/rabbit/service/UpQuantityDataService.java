package com.bazinga.rabbit.service;

import com.bazinga.replay.model.UpQuantityData;
import com.bazinga.replay.query.UpQuantityDataQuery;

import java.util.List;

/**
 * 〈UpQuantityData Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-04-08
 */
public interface UpQuantityDataService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    UpQuantityData save(UpQuantityData record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    UpQuantityData getById(Integer id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(UpQuantityData record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<UpQuantityData> listByCondition(UpQuantityDataQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(UpQuantityDataQuery query);
}