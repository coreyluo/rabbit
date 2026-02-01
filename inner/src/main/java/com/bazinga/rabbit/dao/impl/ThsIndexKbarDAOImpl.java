package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.ThsIndexKbarDAO;
import com.bazinga.replay.model.ThsIndexKbar;
import com.bazinga.replay.query.ThsIndexKbarQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈ThsIndexKbar DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2025-10-23
  */
@Repository
public class ThsIndexKbarDAOImpl extends SqlSessionDaoSupport implements ThsIndexKbarDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.ThsIndexKbarDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(ThsIndexKbar record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public ThsIndexKbar selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(ThsIndexKbar record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<ThsIndexKbar> selectByCondition(ThsIndexKbarQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(ThsIndexKbarQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public ThsIndexKbar selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(ThsIndexKbar record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}