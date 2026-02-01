package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.DisableSellStockPoolDAO;
import com.bazinga.replay.model.DisableSellStockPool;
import com.bazinga.replay.query.DisableSellStockPoolQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈DisableSellStockPool DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-03-29
  */
@Repository
public class DisableSellStockPoolDAOImpl extends SqlSessionDaoSupport implements DisableSellStockPoolDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.DisableSellStockPoolDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(DisableSellStockPool record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public DisableSellStockPool selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(DisableSellStockPool record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<DisableSellStockPool> selectByCondition(DisableSellStockPoolQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(DisableSellStockPoolQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}