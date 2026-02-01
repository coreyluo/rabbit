package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.HistoryStock143000DAO;
import com.bazinga.replay.model.HistoryStock143000;
import com.bazinga.replay.query.HistoryStock143000Query;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈HistoryStock143000 DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-02-01
  */
@Repository
public class HistoryStock143000DAOImpl extends SqlSessionDaoSupport implements HistoryStock143000DAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.HistoryStock143000DAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(HistoryStock143000 record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public HistoryStock143000 selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(HistoryStock143000 record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<HistoryStock143000> selectByCondition(HistoryStock143000Query query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(HistoryStock143000Query query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public HistoryStock143000 selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(HistoryStock143000 record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}