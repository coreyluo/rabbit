package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.MinStockKbarDAO;
import com.bazinga.replay.model.MinStockKbar;
import com.bazinga.replay.query.MinStockKbarQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈MinStockKbar DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-08-23
  */
@Repository
public class MinStockKbarDAOImpl extends SqlSessionDaoSupport implements MinStockKbarDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.MinStockKbarDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(MinStockKbar record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

     @Override
     public void deleteBatchId(List<MinStockKbar> records){
         this.getSqlSession().delete(MAPPER_NAME+".deleteBatchId",records);
     };

    @Override
    public MinStockKbar selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(MinStockKbar record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<MinStockKbar> selectByCondition(MinStockKbarQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(MinStockKbarQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public MinStockKbar selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(MinStockKbar record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}