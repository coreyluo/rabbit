package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.StockLevelFactorDAO;
import com.bazinga.replay.model.StockLevelFactor;
import com.bazinga.replay.query.StockLevelFactorQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈StockLevelFactor DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-01-04
  */
@Repository
public class StockLevelFactorDAOImpl extends SqlSessionDaoSupport implements StockLevelFactorDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.StockLevelFactorDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(StockLevelFactor record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public StockLevelFactor selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(StockLevelFactor record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<StockLevelFactor> selectByCondition(StockLevelFactorQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(StockLevelFactorQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public StockLevelFactor selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(StockLevelFactor record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}