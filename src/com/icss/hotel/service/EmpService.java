package com.icss.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.icss.hotel.pojo.Emp;

/**
 * ҵ���߼�����
 * @author Moline-x
 *
 */

public interface EmpService {
	
	Emp login(String account,String password);

	List<Emp> selectAllEmp();
	
}
