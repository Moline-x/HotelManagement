package com.icss.hotel.controller;

import java.util.Map;
import java.util.HashMap;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.hotel.pojo.Emp;
import com.icss.hotel.service.EmpService;


/**
 * ����ת��
 * @author Moline-x
 *
 */
@Controller
public class EmpController {
	
	@Autowired
	EmpService service;
	
	//��¼
	@RequestMapping("/login")
	@ResponseBody
	public Object login(String account,String password) {
		//�߼����� service
		Emp e = service.login(account,password);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("emp",e);
		if(e != null) {
			map.put("state","success");
		}
		map.put("state","fail");
		
		return map;
	}

}
