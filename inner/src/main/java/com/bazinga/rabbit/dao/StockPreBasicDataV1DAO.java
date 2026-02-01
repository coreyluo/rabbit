package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.StockPreBasicDataV1;
import com.bazinga.replay.query.StockPreBasicDataV1Query;

import java.util.List;

/**
 * 〈StockPreBasicDataV1 DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2023-06-20
 */
public interface StockPreBasicDataV1DAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(StockPreBasicDataV1 record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    StockPreBasicDataV1 selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(StockPreBasicDataV1 record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<StockPreBasicDataV1> selectByCondition(StockPreBasicDataV1Query query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(StockPreBasicDataV1Query query);

}