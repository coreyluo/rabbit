package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.If300OrderSliceDAO;
import com.bazinga.replay.model.If300OrderSlice;
import com.bazinga.replay.query.If300OrderSliceQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈If300OrderSlice DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-03-21
  */
@Repository
public class If300OrderSliceDAOImpl extends SqlSessionDaoSupport implements If300OrderSliceDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.If300OrderSliceDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(If300OrderSlice record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public If300OrderSlice selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(If300OrderSlice record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<If300OrderSlice> selectByCondition(If300OrderSliceQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(If300OrderSliceQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}