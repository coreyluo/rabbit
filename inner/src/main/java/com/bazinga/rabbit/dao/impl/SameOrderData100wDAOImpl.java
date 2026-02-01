package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.SameOrderData100wDAO;
import com.bazinga.replay.model.SameOrderData100w;
import com.bazinga.replay.query.SameOrderData100wQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈SameOrderData100w DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-11-21
  */
@Repository
public class SameOrderData100wDAOImpl extends SqlSessionDaoSupport implements SameOrderData100wDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.SameOrderData100wDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(SameOrderData100w record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public SameOrderData100w selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(SameOrderData100w record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<SameOrderData100w> selectByCondition(SameOrderData100wQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(SameOrderData100wQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public SameOrderData100w selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(SameOrderData100w record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}