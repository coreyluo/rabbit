package com.bazinga.rabbit.dao;

import com.bazinga.replay.model.GatherBuySellInfo;
import com.bazinga.replay.query.GatherBuySellInfoQuery;

import java.util.List;

/**
 * 〈GatherBuySellInfo DAO〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-26
 */
public interface GatherBuySellInfoDAO {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    int insert(GatherBuySellInfo record);

    /**
     * 根据主键查询
     *
     * @param id 数据库主键
     */
    GatherBuySellInfo selectByPrimaryKey(Long id);

    /**
     * 根据主键更新数据
     *
     * @param record 更新参数
     */
    int updateByPrimaryKeySelective(GatherBuySellInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<GatherBuySellInfo> selectByCondition(GatherBuySellInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    Integer countByCondition(GatherBuySellInfoQuery query);

    /**
     * 唯一键kbarDate 查询
     *
     * @param kbarDate 查询参数
     */
    GatherBuySellInfo selectByKbarDate(String kbarDate);

    /**
     * 唯一键kbarDate 更新
     *
     * @param record 更新参数
     */
    int updateByKbarDate(GatherBuySellInfo record);

}