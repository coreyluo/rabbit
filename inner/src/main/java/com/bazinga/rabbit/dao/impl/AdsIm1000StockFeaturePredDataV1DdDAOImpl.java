package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.AdsIm1000StockFeaturePredDataV1DdDAO;
import com.bazinga.replay.model.AdsIm1000StockFeaturePredDataV1Dd;
import com.bazinga.replay.query.AdsIm1000StockFeaturePredDataV1DdQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈AdsIm1000StockFeaturePredDataV1Dd DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-08-20
  */
@Repository
public class AdsIm1000StockFeaturePredDataV1DdDAOImpl extends SqlSessionDaoSupport implements AdsIm1000StockFeaturePredDataV1DdDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.AdsIm1000StockFeaturePredDataV1DdDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(AdsIm1000StockFeaturePredDataV1Dd record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public AdsIm1000StockFeaturePredDataV1Dd selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdsIm1000StockFeaturePredDataV1Dd record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<AdsIm1000StockFeaturePredDataV1Dd> selectByCondition(AdsIm1000StockFeaturePredDataV1DdQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(AdsIm1000StockFeaturePredDataV1DdQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }
}