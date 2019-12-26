package com.icss.hotel.controller;

import java.util.Map;
import java.util.HashMap;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.hotel.pojo.Emp;
import com.icss.hotel.pojo.Room;
import com.icss.hotel.pojo.Type;
import com.icss.hotel.service.EmpService;
import com.icss.hotel.service.RoomService;
import com.icss.hotel.service.TypeService;


/**
 * 请求转发
 * @author Moline-x
 *
 */
@Controller
public class EmpController {
	
	@Autowired
	EmpService service;
	@Autowired
	TypeService tservice;
	@Autowired
	RoomService rservice;
	
	
	
	//登录
	@RequestMapping("/login")
	@ResponseBody
	public Object login(String account,String password) {
		//逻辑处理 service
		Emp e = service.login(account,password);
		
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("emp",e);
		if(e != null) {
			map.put("state","success");
		}else {
			map.put("state","fail");
		}
		
		
		return map;
	}
	
	//查询所有员工信息
	@RequestMapping("/selectAllEmp")
	@ResponseBody
	public Object selectAllEmp() {
		List<Emp> list = service.selectAllEmp();
		return list;
	}
	
	//增加员工信息
	@RequestMapping("/addEmp")
	@ResponseBody
	public Object addEmp(Emp e) {
		int i = service.addEmp(e);
		if(i>0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	//查看所有客房类型信息
		@RequestMapping("/selectAllType")
		@ResponseBody
		public Object selectAllType() {
			List<Type> list = tservice.selectAllType();
			System.out.println(list);
			return list;
		}
		
		//增加客房类型信息
		@RequestMapping("/addType")
		@ResponseBody
		public Object addType(Type e) {
			int i = tservice.addType(e);
			if(i>0) {
				return "success";
			}else {
				return "fail";
			}
		}
		//查看所有客房信息
		@RequestMapping("/selectAllRoom")
		@ResponseBody
		public Object selectAllRoom() {
			List<Room> list = rservice.selectAllRoom();
			System.out.println("list"+list);
			return list;
		}
			
		//增加客房信息
		@RequestMapping("/addRoom")
		@ResponseBody
		public Object addRoom(Room e) {
			int i = rservice.addRoom(e);
			if(i>0) {
				return "success";
			}else {
				return "fail";
			}
		}

}
