package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.IndexLevelInfoDAO;
import com.bazinga.replay.model.IndexLevelInfo;
import com.bazinga.replay.query.IndexLevelInfoQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈IndexLevelInfo DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-08-26
  */
@Repository
public class IndexLevelInfoDAOImpl extends SqlSessionDaoSupport implements IndexLevelInfoDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.IndexLevelInfoDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(IndexLevelInfo record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public IndexLevelInfo selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndexLevelInfo record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<IndexLevelInfo> selectByCondition(IndexLevelInfoQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(IndexLevelInfoQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public IndexLevelInfo selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(IndexLevelInfo record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}