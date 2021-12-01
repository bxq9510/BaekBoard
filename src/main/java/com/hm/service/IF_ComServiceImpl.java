package com.hm.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hm.DAO.IF_ComDAO;
import com.hm.VO.ComVO;

@Service
public class IF_ComServiceImpl implements IF_ComService {
	@Inject
	private IF_ComDAO comdao = null;
	@Override
	public void insert(ComVO comvo) throws Exception {
		comdao.insertCom(comvo);
	}
	@Override
	public List<ComVO> comList(int vno) throws Exception {
		return comdao.comList(vno);
	}
}
