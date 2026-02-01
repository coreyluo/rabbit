package com.bazinga.rabbit.service;

import com.bazinga.replay.model.ThsHyKbar;
import com.bazinga.replay.query.ThsHyKbarQuery;

import java.util.List;

/**
 * 〈ThsHyKbar Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-08-22
 */
public interface ThsHyKbarService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    ThsHyKbar save(ThsHyKbar record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    ThsHyKbar getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(ThsHyKbar record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<ThsHyKbar> listByCondition(ThsHyKbarQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(ThsHyKbarQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    ThsHyKbar getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(ThsHyKbar record);
}