package com.hm.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hm.DAO.IF_BrdDAO;
import com.hm.VO.BrdVO;
import com.hm.VO.PageVO;

@Service
public class IF_BrdServiceImpl implements IF_BrdService {
	@Inject
	private IF_BrdDAO brddao;
	@Override
	public void insert(BrdVO brdvo) throws Exception {
		brddao.insert(brdvo);
	}
	@Override
	public List<BrdVO> brdList(PageVO pagevo) throws Exception {
		return brddao.selectAll(pagevo);
	}
	@Override
	public BrdVO brdDetail(int vno) throws Exception {
		brddao.updateViews(vno);
		return brddao.selectOne(vno);
	}
	@Override
	public void update(BrdVO brdvo) throws Exception {
		brddao.update(brdvo);
	}
	@Override
	public BrdVO modBrdForm(int vno) throws Exception {
		return brddao.selectOne(vno);
	}
	@Override
	public void delete(int vno) throws Exception { 
		brddao.delete(vno);
	}
	@Override
	public int brdcnt() throws Exception {
		return brddao.brdcnt();
	}
}
