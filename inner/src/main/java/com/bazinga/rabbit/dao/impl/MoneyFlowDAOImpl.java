package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.MoneyFlowDAO;
import com.bazinga.replay.model.MoneyFlow;
import com.bazinga.replay.query.MoneyFlowQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈MoneyFlow DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-03-10
  */
@Repository
public class MoneyFlowDAOImpl extends SqlSessionDaoSupport implements MoneyFlowDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.MoneyFlowDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(MoneyFlow record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public MoneyFlow selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(MoneyFlow record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<MoneyFlow> selectByCondition(MoneyFlowQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(MoneyFlowQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public MoneyFlow selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(MoneyFlow record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}