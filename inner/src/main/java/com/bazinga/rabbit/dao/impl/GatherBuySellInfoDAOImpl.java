package com.bazinga.rabbit.dao.impl;

import com.bazinga.replay.dao.GatherBuySellInfoDAO;
import com.bazinga.replay.model.GatherBuySellInfo;
import com.bazinga.replay.query.GatherBuySellInfoQuery;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
  * ��GatherBuySellInfo DAO��<p>
  * ��������ϸ������
  *
  * @author
  * @date 2024-02-26
  */
@Repository
public class GatherBuySellInfoDAOImpl extends SqlSessionDaoSupport implements GatherBuySellInfoDAO {

    private final String MAPPER_NAME = "com.bazinga.replay.dao.GatherBuySellInfoDAO";

    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public int insert(GatherBuySellInfo record) {
        return this.getSqlSession().insert( MAPPER_NAME + ".insert", record);
    }

    @Override
    public GatherBuySellInfo selectByPrimaryKey(Long id) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByPrimaryKey", id);
    }

    @Override
    public int updateByPrimaryKeySelective(GatherBuySellInfo record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByPrimaryKeySelective", record);
    }

    @Override
    public List<GatherBuySellInfo> selectByCondition(GatherBuySellInfoQuery query) {

        return this.getSqlSession().selectList( MAPPER_NAME + ".selectByCondition", query);
    }

    @Override
    public Integer countByCondition(GatherBuySellInfoQuery query) {

        return (Integer)this.getSqlSession().selectOne( MAPPER_NAME + ".countByCondition", query);
    }

    @Override
    public GatherBuySellInfo selectByKbarDate(String kbarDate) {
        return this.getSqlSession().selectOne( MAPPER_NAME + ".selectByKbarDate", kbarDate);
    }

    @Override
    public int updateByKbarDate(GatherBuySellInfo record) {
        return this.getSqlSession().update( MAPPER_NAME + ".updateByKbarDate", record);
    }
}