package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.StockAnalysisResultsDAO;
import com.bazinga.replay.model.StockAnalysisResults;
import com.bazinga.replay.query.StockAnalysisResultsQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈StockAnalysisResults DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-06-20
  */
@Repository
public class StockAnalysisResultsDAOImpl extends SqlSessionDaoSupport implements StockAnalysisResultsDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.StockAnalysisResultsDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(StockAnalysisResults record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public StockAnalysisResults selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(StockAnalysisResults record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<StockAnalysisResults> selectByCondition(StockAnalysisResultsQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(StockAnalysisResultsQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}