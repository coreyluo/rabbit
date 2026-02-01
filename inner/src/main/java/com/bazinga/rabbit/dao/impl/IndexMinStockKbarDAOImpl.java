package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.IndexMinStockKbarDAO;
import com.bazinga.replay.model.IndexMinStockKbar;
import com.bazinga.replay.query.IndexMinStockKbarQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈IndexMinStockKbar DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-10-15
  */
@Repository
public class IndexMinStockKbarDAOImpl extends SqlSessionDaoSupport implements IndexMinStockKbarDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.IndexMinStockKbarDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(IndexMinStockKbar record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public IndexMinStockKbar selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(IndexMinStockKbar record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<IndexMinStockKbar> selectByCondition(IndexMinStockKbarQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(IndexMinStockKbarQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public IndexMinStockKbar selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(IndexMinStockKbar record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}