package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.BtCapitalFlowMinDAO;
import com.bazinga.replay.model.BtCapitalFlowMin;
import com.bazinga.replay.query.BtCapitalFlowMinQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈BtCapitalFlowMin DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2025-12-14
  */
@Repository
public class BtCapitalFlowMinDAOImpl extends SqlSessionDaoSupport implements BtCapitalFlowMinDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.BtCapitalFlowMinDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(BtCapitalFlowMin record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public BtCapitalFlowMin selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(BtCapitalFlowMin record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<BtCapitalFlowMin> selectByCondition(BtCapitalFlowMinQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(BtCapitalFlowMinQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public BtCapitalFlowMin selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(BtCapitalFlowMin record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}