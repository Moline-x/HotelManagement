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
	public int addRoom(Room e) {
		// TODO Auto-generated method stub
		return dao.addRoom(e);
	}

}
