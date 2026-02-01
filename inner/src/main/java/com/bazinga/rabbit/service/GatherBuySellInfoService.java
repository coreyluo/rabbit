package com.bazinga.rabbit.service;

import com.bazinga.replay.model.GatherBuySellInfo;
import com.bazinga.replay.query.GatherBuySellInfoQuery;

import java.util.List;

/**
 * 〈GatherBuySellInfo Service〉<p>
 * 〈功能详细描述〉
 *
 * @author
 * @date 2024-02-26
 */
public interface GatherBuySellInfoService {

    /**
     * 新增一条记录
     *
     * @param record 保存对象
     */
    GatherBuySellInfo save(GatherBuySellInfo record);

    /**
     * 根据ID查询
     *
     * @param id 数据库ID
     */
    GatherBuySellInfo getById(Long id);

    /**
     * 根据id更新一条数据
     *
     * @param record 更新参数
     */
    int updateById(GatherBuySellInfo record);

    /**
     * 根据查询参数查询数据
     *
     * @param query 查询参数
     */
    List<GatherBuySellInfo> listByCondition(GatherBuySellInfoQuery query);

    /**
     * 根据查询参数查询数据总量
     *
     * @param query 查询参数
     */
    int countByCondition(GatherBuySellInfoQuery query);

    /**
     * 唯一键kbarDate 查询
     *
     * @param kbarDate 查询参数
     */
    GatherBuySellInfo getByKbarDate(String kbarDate);

    /**
     * 唯一键kbarDate 更新
     *
     * @param record 更新参数
     */
    int updateByKbarDate(GatherBuySellInfo record);
}