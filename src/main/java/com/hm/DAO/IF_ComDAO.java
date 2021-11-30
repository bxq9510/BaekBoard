package com.hm.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hm.VO.ComVO;

@Repository
public interface IF_ComDAO {
	public void insertCom(ComVO comvo) throws Exception;
	public List<ComVO> comList() throws Exception;
}
