package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.UpQuantityDataDAO;
import com.bazinga.replay.model.UpQuantityData;
import com.bazinga.replay.query.UpQuantityDataQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈UpQuantityData DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2025-04-08
  */
@Repository
public class UpQuantityDataDAOImpl extends SqlSessionDaoSupport implements UpQuantityDataDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.UpQuantityDataDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(UpQuantityData record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public UpQuantityData selectByPrimaryKey(Integer id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(UpQuantityData record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<UpQuantityData> selectByCondition(UpQuantityDataQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(UpQuantityDataQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}