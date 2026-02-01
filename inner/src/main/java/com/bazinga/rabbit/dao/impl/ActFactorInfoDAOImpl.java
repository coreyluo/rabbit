package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.ActFactorInfoDAO;
import com.bazinga.replay.model.ActFactorInfo;
import com.bazinga.replay.query.ActFactorInfoQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈ActFactorInfo DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2025-08-14
  */
@Repository
public class ActFactorInfoDAOImpl extends SqlSessionDaoSupport implements ActFactorInfoDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.ActFactorInfoDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(ActFactorInfo record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public ActFactorInfo selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(ActFactorInfo record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<ActFactorInfo> selectByCondition(ActFactorInfoQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(ActFactorInfoQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}