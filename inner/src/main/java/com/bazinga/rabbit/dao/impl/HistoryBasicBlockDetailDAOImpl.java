package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.HistoryBasicBlockDetailDAO;
import com.bazinga.replay.model.HistoryBasicBlockDetail;
import com.bazinga.replay.query.HistoryBasicBlockDetailQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * 〈HistoryBasicBlockDetail DAO〉<p>
  * 〈功能详细描述〉
  *
  * @author
  * @date 2023-10-27
  */
@Repository
public class HistoryBasicBlockDetailDAOImpl extends SqlSessionDaoSupport implements HistoryBasicBlockDetailDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.HistoryBasicBlockDetailDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(HistoryBasicBlockDetail record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public HistoryBasicBlockDetail selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(HistoryBasicBlockDetail record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<HistoryBasicBlockDetail> selectByCondition(HistoryBasicBlockDetailQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(HistoryBasicBlockDetailQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public HistoryBasicBlockDetail selectByUniqueKey(String uniqueKey) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByUniqueKey", uniqueKey);
    }

    @Override
    public int updateByUniqueKey(HistoryBasicBlockDetail record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByUniqueKey", record);
    }
}