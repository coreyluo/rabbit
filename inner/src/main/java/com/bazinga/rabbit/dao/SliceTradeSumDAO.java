package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.SliceTradeSum;
import com.bazinga.replay.query.SliceTradeSumQuery;

import java.util.List;

/**
 * 〈SliceTradeSum DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-03-21
 */
public interface SliceTradeSumDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(SliceTradeSum record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    SliceTradeSum selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(SliceTradeSum record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<SliceTradeSum> selectByCondition(SliceTradeSumQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(SliceTradeSumQuery query);

    /**
     * 唯一键kbarDate 查询
     *
     * @param kbarDate 查询参数
     */
    SliceTradeSum selectByKbarDate(String kbarDate);

    /**
     * 唯一键kbarDate 更新
     *
     * @param record 更新参数
     */
    int updateByKbarDate(SliceTradeSum record);

}