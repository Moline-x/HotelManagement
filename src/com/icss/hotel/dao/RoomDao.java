package com.icss.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.hotel.pojo.Room;

public interface RoomDao {

	List<Room> selectAllRoom();

	int addRoom(@Param("tno")int tno,@Param("rstate")int rstate,@Param("remark")String remark);

	int deleteRoomById(String rno);

	int updateRoomById(Room r);

}
