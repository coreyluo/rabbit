package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.StockBasicFifteenminuteAdjDAO;
import com.bazinga.replay.model.StockBasicFifteenminuteAdj;
import com.bazinga.replay.query.StockBasicFifteenminuteAdjQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈StockBasicFifteenminuteAdj DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-06-13
  */
@Repository
public class StockBasicFifteenminuteAdjDAOImpl extends SqlSessionDaoSupport implements StockBasicFifteenminuteAdjDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.StockBasicFifteenminuteAdjDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(StockBasicFifteenminuteAdj record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public StockBasicFifteenminuteAdj selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(StockBasicFifteenminuteAdj record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<StockBasicFifteenminuteAdj> selectByCondition(StockBasicFifteenminuteAdjQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(StockBasicFifteenminuteAdjQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}