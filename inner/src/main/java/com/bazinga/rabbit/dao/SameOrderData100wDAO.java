package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.SameOrderData100w;
import com.bazinga.replay.query.SameOrderData100wQuery;

import java.util.List;

/**
 * 〈SameOrderData100w DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-11-21
 */
public interface SameOrderData100wDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(SameOrderData100w record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    SameOrderData100w selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(SameOrderData100w record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<SameOrderData100w> selectByCondition(SameOrderData100wQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(SameOrderData100wQuery query);

    /**
     * 唯一键uniqueKey 查询
     *
     * @param uniqueKey 查询参数
     */
    SameOrderData100w selectByUniqueKey(String uniqueKey);

    /**
     * 唯一键uniqueKey 更新
     *
     * @param record 更新参数
     */
    int updateByUniqueKey(SameOrderData100w record);

}