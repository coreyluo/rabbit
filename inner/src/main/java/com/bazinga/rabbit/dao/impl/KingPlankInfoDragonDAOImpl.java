package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.KingPlankInfoDragonDAO;
import com.bazinga.replay.model.KingPlankInfoDragon;
import com.bazinga.replay.query.KingPlankInfoDragonQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈KingPlankInfoDragon DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2025-11-10
  */
@Repository
public class KingPlankInfoDragonDAOImpl extends SqlSessionDaoSupport implements KingPlankInfoDragonDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.KingPlankInfoDragonDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(KingPlankInfoDragon record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public KingPlankInfoDragon selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(KingPlankInfoDragon record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<KingPlankInfoDragon> selectByCondition(KingPlankInfoDragonQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(KingPlankInfoDragonQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public KingPlankInfoDragon selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(KingPlankInfoDragon record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}