package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.IndexDetailMonthDAO;
import com.bazinga.replay.model.IndexDetailMonth;
import com.bazinga.replay.query.IndexDetailMonthQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * ��IndexDetailMonth DAO��<p>
  * ��������ϸ������
  *
  * @author
  * @date 2023-04-05
  */
@Repository
public class IndexDetailMonthDAOImpl extends SqlSessionDaoSupport implements IndexDetailMonthDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.IndexDetailMonthDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(IndexDetailMonth record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public IndexDetailMonth selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndexDetailMonth record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<IndexDetailMonth> selectByCondition(IndexDetailMonthQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(IndexDetailMonthQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}