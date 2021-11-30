package com.hm.service;

import java.util.List;

import com.hm.VO.ComVO;

public interface IF_ComService {
	public void insert(ComVO comvo) throws Exception;
	public List<ComVO> comList() throws Exception;
}
