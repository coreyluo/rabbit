package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.BlockBatchBuyPoolDAO;
import com.bazinga.replay.model.BlockBatchBuyPool;
import com.bazinga.replay.query.BlockBatchBuyPoolQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈BlockBatchBuyPool DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-03-26
  */
@Repository
public class BlockBatchBuyPoolDAOImpl extends SqlSessionDaoSupport implements BlockBatchBuyPoolDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.BlockBatchBuyPoolDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(BlockBatchBuyPool record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public BlockBatchBuyPool selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(BlockBatchBuyPool record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<BlockBatchBuyPool> selectByCondition(BlockBatchBuyPoolQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(BlockBatchBuyPoolQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}