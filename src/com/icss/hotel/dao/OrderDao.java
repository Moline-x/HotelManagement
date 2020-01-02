package com.icss.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icss.hotel.pojo.Order;

public interface OrderDao {

	int addOrder(@Param("cidcard")String cidcard,@Param("tno")Integer tno,@Param("rno")Integer rno,@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("ostate")Integer ostate);

	List<Order> selectAllOrder();

}
