package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.MoneyFlow143000DAO;
import com.bazinga.replay.model.MoneyFlow143000;
import com.bazinga.replay.query.MoneyFlow143000Query;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈MoneyFlow143000 DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-03-12
  */
@Repository
public class MoneyFlow143000DAOImpl extends SqlSessionDaoSupport implements MoneyFlow143000DAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.MoneyFlow143000DAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(MoneyFlow143000 record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public MoneyFlow143000 selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(MoneyFlow143000 record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<MoneyFlow143000> selectByCondition(MoneyFlow143000Query query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(MoneyFlow143000Query query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public MoneyFlow143000 selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(MoneyFlow143000 record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}