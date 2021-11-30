package com.hm.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hm.VO.ComVO;

@Repository
public class IF_ComDAOImpl implements IF_ComDAO {
	@Autowired
	private SqlSession sqlSession;
	private static String mapperquery = "com.hm.DAO.IF_ComDAO";
	@Override
	public void insertCom(ComVO comvo) throws Exception {
		sqlSession.insert(mapperquery+".insert", comvo);
	}
	@Override
	public List<ComVO> comList() throws Exception {
		return sqlSession.selectList(mapperquery+".comlist");
	}

}
