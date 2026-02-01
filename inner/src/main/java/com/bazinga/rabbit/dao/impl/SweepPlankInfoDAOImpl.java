package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.SweepPlankInfoDAO;
import com.bazinga.replay.model.SweepPlankInfo;
import com.bazinga.replay.query.SweepPlankInfoQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈SweepPlankInfo DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-11-06
  */
@Repository
public class SweepPlankInfoDAOImpl extends SqlSessionDaoSupport implements SweepPlankInfoDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.SweepPlankInfoDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(SweepPlankInfo record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public SweepPlankInfo selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(SweepPlankInfo record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<SweepPlankInfo> selectByCondition(SweepPlankInfoQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(SweepPlankInfoQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public SweepPlankInfo selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(SweepPlankInfo record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}