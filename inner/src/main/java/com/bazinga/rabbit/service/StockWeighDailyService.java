package com.bazinga.rabbit.service;

import com.bazinga.rabbit.model.StockWeighDaily;
import com.bazinga.rabbit.query.StockWeighDailyQuery;

import java.util.List;

/**
 * 〈StockWeighDaily Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-28
 */
public interface StockWeighDailyService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockWeighDaily save(StockWeighDaily record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockWeighDaily getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockWeighDaily record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockWeighDaily> listByCondition(StockWeighDailyQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockWeighDailyQuery query);
}