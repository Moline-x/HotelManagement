 package com.icss.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.hotel.dao.RoomDao;
import com.icss.hotel.pojo.Room;
import com.icss.hotel.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{

	@Autowired
	RoomDao dao;
	@Override
	public List<Room> selectAllRoom() {
		// TODO Auto-generated method stub
		List<Room> list = dao.selectAllRoom();
		return list;
	}
	@Override
	public int addRoom(int tno,int rstate,String remark) {
		// TODO Auto-generated method stub
		return dao.addRoom(tno,rstate,remark);
	}
	@Override
	public int deleteRoomById(String rno) {
		// TODO Auto-generated method stub
		return dao.deleteRoomById(rno);
	}
	@Override
	public int updateRoomById(Room r) {
		// TODO Auto-generated method stub
		return dao.updateRoomById(r);
	}

}
