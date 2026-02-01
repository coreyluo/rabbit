package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.SliceTradeSumDAO;
import com.bazinga.replay.model.SliceTradeSum;
import com.bazinga.replay.query.SliceTradeSumQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈SliceTradeSum DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-03-21
  */
@Repository
public class SliceTradeSumDAOImpl extends SqlSessionDaoSupport implements SliceTradeSumDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.SliceTradeSumDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(SliceTradeSum record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public SliceTradeSum selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(SliceTradeSum record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<SliceTradeSum> selectByCondition(SliceTradeSumQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(SliceTradeSumQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public SliceTradeSum selectByKbarDate(String kbarDate) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByKbarDate", kbarDate);
    }

    @Override
    public int updateByKbarDate(SliceTradeSum record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByKbarDate", record);
    }
}