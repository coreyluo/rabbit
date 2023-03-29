package com.bazinga.rabbit.dao.impl;

import com.bazinga.rabbit.dao.StockWeighDailyDAO;
import com.bazinga.rabbit.model.StockWeighDaily;
import com.bazinga.rabbit.query.StockWeighDailyQuery;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

import org.springframework.util.Assert;

 /**
  * 〈StockWeighDaily DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-03-28
  */
@Repository
public class StockWeighDailyDAOImpl extends SqlSessionDaoSupport implements StockWeighDailyDAO {

    private final String MAPPER_NAME = "com.bazinga.rabbit.dao.StockWeighDailyDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(StockWeighDaily record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public StockWeighDaily selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(StockWeighDaily record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<StockWeighDaily> selectByCondition(StockWeighDailyQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(StockWeighDailyQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}