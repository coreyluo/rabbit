package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.MarketLoverUrlDAO;
import com.bazinga.replay.model.MarketLoverUrl;
import com.bazinga.replay.query.MarketLoverUrlQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈MarketLoverUrl DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-10-20
  */
@Repository
public class MarketLoverUrlDAOImpl extends SqlSessionDaoSupport implements MarketLoverUrlDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.MarketLoverUrlDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(MarketLoverUrl record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public MarketLoverUrl selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(MarketLoverUrl record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<MarketLoverUrl> selectByCondition(MarketLoverUrlQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(MarketLoverUrlQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}