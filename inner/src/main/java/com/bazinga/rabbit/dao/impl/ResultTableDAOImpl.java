package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.ResultTableDAO;
import com.bazinga.replay.model.ResultTable;
import com.bazinga.replay.query.ResultTableQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈ResultTable DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-06-20
  */
@Repository
public class ResultTableDAOImpl extends SqlSessionDaoSupport implements ResultTableDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.ResultTableDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(ResultTable record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public ResultTable selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(ResultTable record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<ResultTable> selectByCondition(ResultTableQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(ResultTableQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}