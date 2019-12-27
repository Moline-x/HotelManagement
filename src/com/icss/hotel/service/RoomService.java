package com.icss.hotel.service;

import java.util.List;

import com.icss.hotel.pojo.Room;

public interface RoomService {

	List<Room> selectAllRoom();

	int addRoom(int tno,int rstate,String remark);

	int deleteRoomById(String rno);

	int updateRoomById(Room r);

}
