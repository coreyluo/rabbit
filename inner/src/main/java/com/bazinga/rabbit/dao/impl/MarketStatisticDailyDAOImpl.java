package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.MarketStatisticDailyDAO;
import com.bazinga.replay.model.MarketStatisticDaily;
import com.bazinga.replay.query.MarketStatisticDailyQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈MarketStatisticDaily DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2025-10-23
  */
@Repository
public class MarketStatisticDailyDAOImpl extends SqlSessionDaoSupport implements MarketStatisticDailyDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.MarketStatisticDailyDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(MarketStatisticDaily record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public MarketStatisticDaily selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(MarketStatisticDaily record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<MarketStatisticDaily> selectByCondition(MarketStatisticDailyQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(MarketStatisticDailyQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public MarketStatisticDaily selectByKbarDate(String kbarDate) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByKbarDate", kbarDate);
    }

    @Override
    public int updateByKbarDate(MarketStatisticDaily record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByKbarDate", record);
    }
}