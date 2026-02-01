package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.StockPreBasicDataV1DAO;
import com.bazinga.replay.model.StockPreBasicDataV1;
import com.bazinga.replay.query.StockPreBasicDataV1Query;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈StockPreBasicDataV1 DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-06-20
  */
@Repository
public class StockPreBasicDataV1DAOImpl extends SqlSessionDaoSupport implements StockPreBasicDataV1DAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.StockPreBasicDataV1DAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(StockPreBasicDataV1 record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public StockPreBasicDataV1 selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(StockPreBasicDataV1 record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<StockPreBasicDataV1> selectByCondition(StockPreBasicDataV1Query query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(StockPreBasicDataV1Query query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}