package com.icss.hotel.service;

import org.springframework.stereotype.Service;

import com.icss.hotel.pojo.Emp;

/**
 * ҵ���߼�����
 * @author Moline-x
 *
 */
@Service
public interface EmpService {
	
	Emp login(String account,String password);
	
}
