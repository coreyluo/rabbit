package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.HistoryBlockDetailDAO;
import com.bazinga.replay.model.HistoryBlockDetail;
import com.bazinga.replay.query.HistoryBlockDetailQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈HistoryBlockDetail DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-06-12
  */
@Repository
public class HistoryBlockDetailDAOImpl extends SqlSessionDaoSupport implements HistoryBlockDetailDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.HistoryBlockDetailDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(HistoryBlockDetail record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public HistoryBlockDetail selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(HistoryBlockDetail record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<HistoryBlockDetail> selectByCondition(HistoryBlockDetailQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(HistoryBlockDetailQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public HistoryBlockDetail selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(HistoryBlockDetail record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }

     @Override
     public void deleteByPrimaryKey(Long id) {
         this.getSqlSession().delete( MAPPER_NAME + ".deleteByPrimaryKey", id);
     }
}