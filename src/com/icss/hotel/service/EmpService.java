package com.icss.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.icss.hotel.pojo.Emp;
import com.icss.hotel.pojo.Type;

/**
 * 业务逻辑处理
 * @author Moline-x
 *
 */

public interface EmpService {
	
	Emp login(String account,String password);

	List<Emp> selectAllEmp();

	int addEmp(Emp e);

	
}
