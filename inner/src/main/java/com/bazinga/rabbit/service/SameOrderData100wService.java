package com.bazinga.rabbit.service;

import com.bazinga.replay.model.SameOrderData100w;
import com.bazinga.replay.query.SameOrderData100wQuery;

import java.util.List;

/**
 * 〈SameOrderData100w Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-11-21
 */
public interface SameOrderData100wService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    SameOrderData100w save(SameOrderData100w record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    SameOrderData100w getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(SameOrderData100w record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<SameOrderData100w> listByCondition(SameOrderData100wQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(SameOrderData100wQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    SameOrderData100w getByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(SameOrderData100w record);
}