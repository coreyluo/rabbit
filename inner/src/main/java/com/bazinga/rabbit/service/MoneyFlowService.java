package com.bazinga.rabbit.service;

import com.bazinga.replay.model.MoneyFlow;
import com.bazinga.replay.query.MoneyFlowQuery;

import java.util.List;

/**
 * 〈MoneyFlow Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-10
 */
public interface MoneyFlowService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    MoneyFlow save(MoneyFlow record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    MoneyFlow getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(MoneyFlow record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MoneyFlow> listByCondition(MoneyFlowQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(MoneyFlowQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    MoneyFlow getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(MoneyFlow record);
}