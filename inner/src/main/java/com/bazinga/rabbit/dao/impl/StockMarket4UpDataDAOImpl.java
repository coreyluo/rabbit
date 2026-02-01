package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.StockMarket4UpDataDAO;
import com.bazinga.replay.model.StockMarket4UpData;
import com.bazinga.replay.query.StockMarket4UpDataQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈StockMarket4UpData DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2025-03-26
  */
@Repository
public class StockMarket4UpDataDAOImpl extends SqlSessionDaoSupport implements StockMarket4UpDataDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.StockMarket4UpDataDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(StockMarket4UpData record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public StockMarket4UpData selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(StockMarket4UpData record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<StockMarket4UpData> selectByCondition(StockMarket4UpDataQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(StockMarket4UpDataQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}