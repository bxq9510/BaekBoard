package com.hm.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hm.VO.UsrVO;

@Repository
public class IF_UsrDAOImpl implements IF_UsrDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private static String mapperquery = "com.hm.DAO.IF_UsrDAO";
	
	@Override
	public void insertUsr(UsrVO usrvo) throws Exception {
		sqlSession.insert(mapperquery+".insert", usrvo);
	}

	@Override
	public List<UsrVO> usrList() throws Exception {
		return sqlSession.selectList(mapperquery+".usrlist");
	}

	@Override
	public void usrDel(String uid) throws Exception {
		sqlSession.delete(mapperquery+".delete", uid);
	}

	@Override
	public void update(UsrVO usrvo) throws Exception {
		sqlSession.update(mapperquery+".update", usrvo);
	}

	@Override
	public UsrVO usrSelectOne(String uid) throws Exception {
		return sqlSession.selectOne(mapperquery+".selectone", uid);
	}

}
