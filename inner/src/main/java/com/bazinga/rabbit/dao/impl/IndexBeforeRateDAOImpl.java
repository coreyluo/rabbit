package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.IndexBeforeRateDAO;
import com.bazinga.replay.model.IndexBeforeRate;
import com.bazinga.replay.query.IndexBeforeRateQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈IndexBeforeRate DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2025-10-23
  */
@Repository
public class IndexBeforeRateDAOImpl extends SqlSessionDaoSupport implements IndexBeforeRateDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.IndexBeforeRateDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(IndexBeforeRate record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public IndexBeforeRate selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndexBeforeRate record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<IndexBeforeRate> selectByCondition(IndexBeforeRateQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(IndexBeforeRateQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public IndexBeforeRate selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(IndexBeforeRate record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}