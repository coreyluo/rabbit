package com.bazinga.rabbit.service;

import com.bazinga.replay.model.IndexMinStockKbar;
import com.bazinga.replay.query.IndexMinStockKbarQuery;

import java.util.List;

/**
 * 〈IndexMinStockKbar Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-10-15
 */
public interface IndexMinStockKbarService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    IndexMinStockKbar save(IndexMinStockKbar record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    IndexMinStockKbar getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(IndexMinStockKbar record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<IndexMinStockKbar> listByCondition(IndexMinStockKbarQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(IndexMinStockKbarQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    IndexMinStockKbar getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(IndexMinStockKbar record);
}