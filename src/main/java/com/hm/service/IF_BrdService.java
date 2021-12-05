package com.hm.service;

import java.util.List;
import com.hm.VO.BrdVO;
import com.hm.VO.PageVO;

public interface IF_BrdService {
	// 게시판 글 추가
	public void insert(BrdVO brdvo) throws Exception;
	// 게시판 글 전체보기
	public List<BrdVO> brdList(PageVO pagevo) throws Exception;
	// 게시판 글 자세히 보기
	public BrdVO brdDetail(int vno) throws Exception;
	// 게시판 글 수정
	public void update(BrdVO brdvo) throws Exception;
	// 게시판 수정할 글 불러오기
	public BrdVO modBrdForm(int vno) throws Exception;
	// 게시판 글 삭제
	public void delete(int vno) throws Exception;
	
	public int brdcnt() throws Exception;
}
