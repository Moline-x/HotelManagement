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
	//�鿴���пͷ���Ϣ
	@RequestMapping("/selectAllRoom")
	@ResponseBody
	public Object selectAllRoom() {
		List<Room> list = service.selectAllRoom();
		System.out.println("list"+list);
		return list;
	}
		
	//���ӿͷ���Ϣ
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
	
	//ɾ���ͷ�
	@RequestMapping("/deleteRoomById")
	@ResponseBody
	public Object deleteRoomById(String rno) {
		int i = service.deleteRoomById(rno);
		if(i > 0) {
			return "success";
		}else {
			return "fail";
		}
	}
	
	//�༭
	@RequestMapping("/updateRoomById")
	@ResponseBody
	public Object updateRoomById(Room r) {
		int i = service.updateRoomById(r);
		if(i > 0) {
			return "success";
		}else {
			return "fail";
		}
	}
}
