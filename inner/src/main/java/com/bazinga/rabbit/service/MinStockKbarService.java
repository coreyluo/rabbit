package com.bazinga.rabbit.service;

import com.bazinga.replay.model.MinStockKbar;
import com.bazinga.replay.query.MinStockKbarQuery;

import java.util.List;

/**
 * 〈MinStockKbar Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-08-23
 */
public interface MinStockKbarService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    MinStockKbar save(MinStockKbar record);

    void deleteBatchId(List<MinStockKbar> records);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    MinStockKbar getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(MinStockKbar record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MinStockKbar> listByCondition(MinStockKbarQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(MinStockKbarQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    MinStockKbar getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(MinStockKbar record);
}