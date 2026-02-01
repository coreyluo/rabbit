package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.HyStatisticInfoV1DAO;
import com.bazinga.replay.model.HyStatisticInfoV1;
import com.bazinga.replay.query.HyStatisticInfoV1Query;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈HyStatisticInfoV1 DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-10-15
  */
@Repository
public class HyStatisticInfoV1DAOImpl extends SqlSessionDaoSupport implements HyStatisticInfoV1DAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.HyStatisticInfoV1DAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(HyStatisticInfoV1 record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public HyStatisticInfoV1 selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(HyStatisticInfoV1 record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<HyStatisticInfoV1> selectByCondition(HyStatisticInfoV1Query query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(HyStatisticInfoV1Query query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}