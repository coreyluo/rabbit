package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.MarketLoverParamDAO;
import com.bazinga.replay.model.MarketLoverParam;
import com.bazinga.replay.query.MarketLoverParamQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈MarketLoverParam DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-10-20
  */
@Repository
public class MarketLoverParamDAOImpl extends SqlSessionDaoSupport implements MarketLoverParamDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.MarketLoverParamDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(MarketLoverParam record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public MarketLoverParam selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(MarketLoverParam record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<MarketLoverParam> selectByCondition(MarketLoverParamQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(MarketLoverParamQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public MarketLoverParam selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(MarketLoverParam record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}