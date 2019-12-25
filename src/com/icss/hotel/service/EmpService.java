package com.icss.hotel.service;

import org.springframework.stereotype.Service;

import com.icss.hotel.pojo.Emp;

/**
 * 业务逻辑处理
 * @author Moline-x
 *
 */
@Service
public interface EmpService {
	
	Emp login(String account,String password);
	
}
