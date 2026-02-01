package com.bazinga.rabbit.service;

import com.bazinga.replay.model.IndexBeforeRate;
import com.bazinga.replay.query.IndexBeforeRateQuery;

import java.util.List;

/**
 * 〈IndexBeforeRate Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-10-23
 */
public interface IndexBeforeRateService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    IndexBeforeRate save(IndexBeforeRate record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    IndexBeforeRate getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(IndexBeforeRate record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<IndexBeforeRate> listByCondition(IndexBeforeRateQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(IndexBeforeRateQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    IndexBeforeRate getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(IndexBeforeRate record);
}