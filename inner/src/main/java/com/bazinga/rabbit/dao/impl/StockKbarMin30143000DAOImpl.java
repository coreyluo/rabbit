package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.StockKbarMin30143000DAO;
import com.bazinga.replay.model.StockKbarMin30143000;
import com.bazinga.replay.query.StockKbarMin30143000Query;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈StockKbarMin30143000 DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-03-03
  */
@Repository
public class StockKbarMin30143000DAOImpl extends SqlSessionDaoSupport implements StockKbarMin30143000DAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.StockKbarMin30143000DAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(StockKbarMin30143000 record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public StockKbarMin30143000 selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(StockKbarMin30143000 record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<StockKbarMin30143000> selectByCondition(StockKbarMin30143000Query query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(StockKbarMin30143000Query query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}