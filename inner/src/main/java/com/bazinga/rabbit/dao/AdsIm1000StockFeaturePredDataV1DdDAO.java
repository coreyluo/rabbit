package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.AdsIm1000StockFeaturePredDataV1Dd;
import com.bazinga.replay.query.AdsIm1000StockFeaturePredDataV1DdQuery;

import java.util.List;

/**
 * 〈AdsIm1000StockFeaturePredDataV1Dd DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-08-20
 */
public interface AdsIm1000StockFeaturePredDataV1DdDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(AdsIm1000StockFeaturePredDataV1Dd record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    AdsIm1000StockFeaturePredDataV1Dd selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(AdsIm1000StockFeaturePredDataV1Dd record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<AdsIm1000StockFeaturePredDataV1Dd> selectByCondition(AdsIm1000StockFeaturePredDataV1DdQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(AdsIm1000StockFeaturePredDataV1DdQuery query);

}