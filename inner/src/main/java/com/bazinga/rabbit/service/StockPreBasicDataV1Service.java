package com.bazinga.rabbit.service;

import com.bazinga.replay.model.StockPreBasicDataV1;
import com.bazinga.replay.query.StockPreBasicDataV1Query;

import java.util.List;

/**
 * 〈StockPreBasicDataV1 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-20
 */
public interface StockPreBasicDataV1Service {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockPreBasicDataV1 save(StockPreBasicDataV1 record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockPreBasicDataV1 getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockPreBasicDataV1 record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockPreBasicDataV1> listByCondition(StockPreBasicDataV1Query query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockPreBasicDataV1Query query);
}