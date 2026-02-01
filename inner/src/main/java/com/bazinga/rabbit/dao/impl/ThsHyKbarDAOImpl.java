package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.ThsHyKbarDAO;
import com.bazinga.replay.model.ThsHyKbar;
import com.bazinga.replay.query.ThsHyKbarQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈ThsHyKbar DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-08-22
  */
@Repository
public class ThsHyKbarDAOImpl extends SqlSessionDaoSupport implements ThsHyKbarDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.ThsHyKbarDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(ThsHyKbar record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public ThsHyKbar selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(ThsHyKbar record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<ThsHyKbar> selectByCondition(ThsHyKbarQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(ThsHyKbarQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public ThsHyKbar selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(ThsHyKbar record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}