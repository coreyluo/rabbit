package com.bazinga.rabbit.service;

import com.bazinga.replay.model.SliceTradeSum;
import com.bazinga.replay.query.SliceTradeSumQuery;

import java.util.List;

/**
 * 〈SliceTradeSum Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-21
 */
public interface SliceTradeSumService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    SliceTradeSum save(SliceTradeSum record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    SliceTradeSum getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(SliceTradeSum record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<SliceTradeSum> listByCondition(SliceTradeSumQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(SliceTradeSumQuery query);

    /**
     * 唯一键kbarDate 查询
     *
     * @param kbarDate 查询参数
     */
    SliceTradeSum getByKbarDate(String kbarDate);

    /**
     * 唯一键kbarDate 更新
     *
     * @param record 更新参数
     */
    int updateByKbarDate(SliceTradeSum record);
}