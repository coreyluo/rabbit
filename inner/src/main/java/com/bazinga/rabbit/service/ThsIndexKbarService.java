package com.bazinga.rabbit.service;

import com.bazinga.replay.model.ThsIndexKbar;
import com.bazinga.replay.query.ThsIndexKbarQuery;

import java.util.List;

/**
 * 〈ThsIndexKbar Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-10-23
 */
public interface ThsIndexKbarService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    ThsIndexKbar save(ThsIndexKbar record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    ThsIndexKbar getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(ThsIndexKbar record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<ThsIndexKbar> listByCondition(ThsIndexKbarQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(ThsIndexKbarQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    ThsIndexKbar getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(ThsIndexKbar record);
}