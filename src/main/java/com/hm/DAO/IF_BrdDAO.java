package com.hm.DAO;

import java.util.List;
import com.hm.VO.BrdVO;
import com.hm.VO.PageVO;

public interface IF_BrdDAO {
	// 게시판 글 추가
	public void insert(BrdVO brdvo) throws Exception;
	// 게시판 글 전체보기
	public List<BrdVO> selectAll(PageVO pagevo) throws Exception;
	// 게시판 글 조회수 증가
	public void updateViews(int vno) throws Exception;
	// 게시판 글 자세히 보기
	public BrdVO selectOne(int vno) throws Exception;
	// 게시판 글 수정
	public void update(BrdVO brdvo) throws Exception;
	// 게시판 글 삭제
	public void delete(int vno) throws Exception;
	public int brdcnt() throws Exception;
}
