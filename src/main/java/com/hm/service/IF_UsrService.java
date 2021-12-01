package com.hm.service;

import java.util.List;

import com.hm.VO.UsrVO;

public interface IF_UsrService {
	public void insert(UsrVO usrvo) throws Exception;
	public List<UsrVO> usrList() throws Exception;
	public void usrDel(String uid) throws Exception;
	public void update(UsrVO usrvo) throws Exception;
	public UsrVO usrModForm(String uid) throws Exception;
}
