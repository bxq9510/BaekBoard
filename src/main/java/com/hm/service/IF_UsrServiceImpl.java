package com.hm.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hm.DAO.IF_UsrDAO;
import com.hm.VO.UsrVO;

@Service
public class IF_UsrServiceImpl implements IF_UsrService {
	@Inject
	private IF_UsrDAO usrdao = null;

	@Override
	public void insert(UsrVO usrvo) throws Exception {
		usrdao.insertUsr(usrvo);
	}

	@Override
	public List<UsrVO> usrList() throws Exception {

		return usrdao.usrList();
	}
}
