package com.icss.hotel.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.hotel.pojo.Room;
import com.icss.hotel.service.RoomService;

@Controller
public class RoomController {
	
	@Autowired
	RoomService service;
	//查看所有客房信息
	@RequestMapping("/selectAllRoom")
	@ResponseBody
	public Object selectAllRoom() {
		List<Room> list = service.selectAllRoom();
		System.out.println("list"+list);
		return list;
	}
		
	//增加客房信息
	@RequestMapping("/addRoom")
	@ResponseBody
	public Object addRoom(int tno,int rstate,String remark) {
		int i = service.addRoom(tno,rstate,remark);
		if(i>0) {
			return "success";
		}else {
			return "fail";
		}
	}
}
