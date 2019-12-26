package com.icss.hotel.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.hotel.pojo.Type;
import com.icss.hotel.service.TypeService;

@Controller
public class TypeController {
	
	@Autowired
	TypeService service;
	
	//查看所有客房类型信息
	@RequestMapping("/selectAllType")
	@ResponseBody
	public Object selectAllType() {
		List<Type> list = service.selectAllType();
		System.out.println(list);
		return list;
	}
}
