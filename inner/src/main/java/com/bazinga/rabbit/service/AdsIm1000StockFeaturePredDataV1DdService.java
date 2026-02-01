package com.bazinga.rabbit.service;

import com.bazinga.replay.model.AdsIm1000StockFeaturePredDataV1Dd;
import com.bazinga.replay.query.AdsIm1000StockFeaturePredDataV1DdQuery;

import java.util.List;

/**
 * 〈AdsIm1000StockFeaturePredDataV1Dd Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-08-20
 */
public interface AdsIm1000StockFeaturePredDataV1DdService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    AdsIm1000StockFeaturePredDataV1Dd save(AdsIm1000StockFeaturePredDataV1Dd record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    AdsIm1000StockFeaturePredDataV1Dd getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(AdsIm1000StockFeaturePredDataV1Dd record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<AdsIm1000StockFeaturePredDataV1Dd> listByCondition(AdsIm1000StockFeaturePredDataV1DdQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(AdsIm1000StockFeaturePredDataV1DdQuery query);
}