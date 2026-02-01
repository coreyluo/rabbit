package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.MinMoneyFlowDAO;
import com.bazinga.replay.model.MinMoneyFlow;
import com.bazinga.replay.query.MinMoneyFlowQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈MinMoneyFlow DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-03-10
  */
@Repository
public class MinMoneyFlowDAOImpl extends SqlSessionDaoSupport implements MinMoneyFlowDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.MinMoneyFlowDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(MinMoneyFlow record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public MinMoneyFlow selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(MinMoneyFlow record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<MinMoneyFlow> selectByCondition(MinMoneyFlowQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(MinMoneyFlowQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public MinMoneyFlow selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(MinMoneyFlow record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}