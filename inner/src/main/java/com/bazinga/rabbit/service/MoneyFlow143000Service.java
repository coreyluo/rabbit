package com.bazinga.rabbit.service;

import com.bazinga.replay.model.MoneyFlow143000;
import com.bazinga.replay.query.MoneyFlow143000Query;

import java.util.List;

/**
 * 〈MoneyFlow143000 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-12
 */
public interface MoneyFlow143000Service {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    MoneyFlow143000 save(MoneyFlow143000 record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    MoneyFlow143000 getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(MoneyFlow143000 record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<MoneyFlow143000> listByCondition(MoneyFlow143000Query query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(MoneyFlow143000Query query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    MoneyFlow143000 getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(MoneyFlow143000 record);
}