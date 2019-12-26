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
 * ����ת��
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
		}else {
			map.put("state","fail");
		}
		
		
		return map;
	}
	
	//��ѯ����Ա����Ϣ
	@RequestMapping("/selectAllEmp")
	@ResponseBody
	public Object selectAllEmp() {
		List<Emp> list = service.selectAllEmp();
		return list;
	}
	
	//����Ա����Ϣ
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
	
	//�鿴���пͷ�������Ϣ
		@RequestMapping("/selectAllType")
		@ResponseBody
		public Object selectAllType() {
			List<Type> list = tservice.selectAllType();
			System.out.println(list);
			return list;
		}
		
		//���ӿͷ�������Ϣ
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
		//�鿴���пͷ���Ϣ
		@RequestMapping("/selectAllRoom")
		@ResponseBody
		public Object selectAllRoom() {
			List<Room> list = rservice.selectAllRoom();
			System.out.println("list"+list);
			return list;
		}
			
		//���ӿͷ���Ϣ
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
