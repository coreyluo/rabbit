package com.bazinga.rabbit.service;

import com.bazinga.replay.model.ThsHyMinStockKbar;
import com.bazinga.replay.query.ThsHyMinStockKbarQuery;

import java.util.List;

/**
 * 〈ThsHyMinStockKbar Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-11-11
 */
public interface ThsHyMinStockKbarService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    ThsHyMinStockKbar save(ThsHyMinStockKbar record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    ThsHyMinStockKbar getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(ThsHyMinStockKbar record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<ThsHyMinStockKbar> listByCondition(ThsHyMinStockKbarQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(ThsHyMinStockKbarQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    ThsHyMinStockKbar getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(ThsHyMinStockKbar record);
}