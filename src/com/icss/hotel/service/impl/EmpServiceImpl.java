package com.icss.hotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.hotel.dao.EmpDao;
import com.icss.hotel.pojo.Emp;
import com.icss.hotel.service.EmpService;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpDao dao;
	
	@Override
	public Emp login(String account,String password) {
		Emp emp  = dao.login(account, password);
		return emp;
	}
	
	@Override
	public List<Emp> selectAllEmp(){
		List<Emp> list = dao.selectAllEmp();
		return list;
	}
	
	@Override
	public int addEmp(Emp e) {
		return dao.addEmp(e);
	}
	
}
