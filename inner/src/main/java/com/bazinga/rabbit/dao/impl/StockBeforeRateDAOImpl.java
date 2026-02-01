package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.StockBeforeRateDAO;
import com.bazinga.replay.model.StockBeforeRate;
import com.bazinga.replay.query.StockBeforeRateQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈StockBeforeRate DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-12-28
  */
@Repository
public class StockBeforeRateDAOImpl extends SqlSessionDaoSupport implements StockBeforeRateDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.StockBeforeRateDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(StockBeforeRate record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public StockBeforeRate selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(StockBeforeRate record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<StockBeforeRate> selectByCondition(StockBeforeRateQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(StockBeforeRateQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public StockBeforeRate selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(StockBeforeRate record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}