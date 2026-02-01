package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.OpenInfoDataDAO;
import com.bazinga.replay.model.OpenInfoData;
import com.bazinga.replay.query.OpenInfoDataQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈OpenInfoData DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2024-01-30
  */
@Repository
public class OpenInfoDataDAOImpl extends SqlSessionDaoSupport implements OpenInfoDataDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.OpenInfoDataDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(OpenInfoData record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public OpenInfoData selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(OpenInfoData record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<OpenInfoData> selectByCondition(OpenInfoDataQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(OpenInfoDataQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public OpenInfoData selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(OpenInfoData record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}