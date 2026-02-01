package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.IndexBeforeRate;
import com.bazinga.replay.query.IndexBeforeRateQuery;

import java.util.List;

/**
 * 〈IndexBeforeRate DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2025-10-23
 */
public interface IndexBeforeRateDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(IndexBeforeRate record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    IndexBeforeRate selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(IndexBeforeRate record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<IndexBeforeRate> selectByCondition(IndexBeforeRateQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(IndexBeforeRateQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    IndexBeforeRate selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(IndexBeforeRate record);

}