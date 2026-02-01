package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.EtfTradeRecordsDAO;
import com.bazinga.replay.model.EtfTradeRecords;
import com.bazinga.replay.query.EtfTradeRecordsQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈EtfTradeRecords DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2025-11-14
  */
@Repository
public class EtfTradeRecordsDAOImpl extends SqlSessionDaoSupport implements EtfTradeRecordsDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.EtfTradeRecordsDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(EtfTradeRecords record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public EtfTradeRecords selectByPrimaryKey(Integer id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(EtfTradeRecords record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<EtfTradeRecords> selectByCondition(EtfTradeRecordsQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(EtfTradeRecordsQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}