package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.StockKbar143000DAO;
import com.bazinga.replay.model.StockKbar143000;
import com.bazinga.replay.query.StockKbar143000Query;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈StockKbar143000 DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-02-01
  */
@Repository
public class StockKbar143000DAOImpl extends SqlSessionDaoSupport implements StockKbar143000DAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.StockKbar143000DAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(StockKbar143000 record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public StockKbar143000 selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(StockKbar143000 record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<StockKbar143000> selectByCondition(StockKbar143000Query query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(StockKbar143000Query query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public StockKbar143000 selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(StockKbar143000 record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}