package com.hm.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hm.VO.UsrVO;

@Repository
public interface IF_UsrDAO {
	//insert dusr values (?,?,?,?)
	public void insertUsr(UsrVO usrvo) throws Exception;
	public List<UsrVO> usrList() throws Exception;
}
