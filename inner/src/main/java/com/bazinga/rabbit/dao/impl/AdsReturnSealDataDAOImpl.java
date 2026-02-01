package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.AdsReturnSealDataDAO;
import com.bazinga.replay.model.AdsReturnSealData;
import com.bazinga.replay.query.AdsReturnSealDataQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈AdsReturnSealData DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2025-07-30
  */
@Repository
public class AdsReturnSealDataDAOImpl extends SqlSessionDaoSupport implements AdsReturnSealDataDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.AdsReturnSealDataDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(AdsReturnSealData record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public AdsReturnSealData selectByPrimaryKey(Integer id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdsReturnSealData record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<AdsReturnSealData> selectByCondition(AdsReturnSealDataQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(AdsReturnSealDataQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}