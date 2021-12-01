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

	@Override
	public void usrDel(String uid) throws Exception {
		usrdao.usrDel(uid);
	}

	@Override
	public void update(UsrVO usrvo) throws Exception {
		usrdao.update(usrvo);
	}

	@Override
	public UsrVO usrModForm(String uid) throws Exception {
		return usrdao.usrSelectOne(uid);
	}
}
