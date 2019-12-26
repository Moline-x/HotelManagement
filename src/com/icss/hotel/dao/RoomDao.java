package com.icss.hotel.dao;

import java.util.List;

import com.icss.hotel.pojo.Room;

public interface RoomDao {

	List<Room> selectAllRoom();

	int addRoom(Room e);

}
