package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.ThsHyMinStockKbarDAO;
import com.bazinga.replay.model.ThsHyMinStockKbar;
import com.bazinga.replay.query.ThsHyMinStockKbarQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈ThsHyMinStockKbar DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-11-11
  */
@Repository
public class ThsHyMinStockKbarDAOImpl extends SqlSessionDaoSupport implements ThsHyMinStockKbarDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.ThsHyMinStockKbarDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(ThsHyMinStockKbar record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public ThsHyMinStockKbar selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(ThsHyMinStockKbar record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<ThsHyMinStockKbar> selectByCondition(ThsHyMinStockKbarQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(ThsHyMinStockKbarQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public ThsHyMinStockKbar selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(ThsHyMinStockKbar record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}