package com.bazinga.rabbit.service;

import com.bazinga.replay.model.StockKbarMin30143000;
import com.bazinga.replay.query.StockKbarMin30143000Query;

import java.util.List;

/**
 * 〈StockKbarMin30143000 Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-03-03
 */
public interface StockKbarMin30143000Service {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    StockKbarMin30143000 save(StockKbarMin30143000 record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    StockKbarMin30143000 getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(StockKbarMin30143000 record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockKbarMin30143000> listByCondition(StockKbarMin30143000Query query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(StockKbarMin30143000Query query);
}