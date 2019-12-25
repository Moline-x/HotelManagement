package com.icss.hotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.hotel.dao.EmpDao;
import com.icss.hotel.pojo.Emp;
import com.icss.hotel.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpDao dao;
	
	@Override
	public Emp login(String account,String password) {
		Emp emp  = dao.login(account, password);
		return emp;
	}
}
