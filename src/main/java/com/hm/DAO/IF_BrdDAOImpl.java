package com.hm.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hm.VO.BrdVO;

@Repository
public class IF_BrdDAOImpl implements IF_BrdDAO {

	@Inject // 컨테이너로부터 객체 주입
	private SqlSession sqlSession;
	private static String mapperquery = "com.hm.DAO.IF_BrdDAO";
	@Override
	public void insert(BrdVO brdvo) throws Exception {
		sqlSession.insert(mapperquery+".insert", brdvo);
	}
	@Override
	public List<BrdVO> selectAll() throws Exception {
		return sqlSession.selectList(mapperquery+".brdlist");
	}
	@Override
	public void updateViews(int vno) throws Exception {
		sqlSession.update(mapperquery+".updateviews", vno);
	}
	@Override
	public BrdVO selectOne(int vno) throws Exception {
		return sqlSession.selectOne(mapperquery+".selectone", vno);
	}
	@Override
	public void update(BrdVO brdvo) throws Exception {
		sqlSession.update(mapperquery+".updateone", brdvo);
	}
	@Override
	public void delete(int vno) throws Exception {
		sqlSession.delete(mapperquery+".delete", vno);
	}

}
