package com.icss.hotel.service;

import java.util.List;

import com.icss.hotel.pojo.Order;

public interface OrderService {

	int addOrder(String cidcard,Integer tno,Integer rno,String startTime,String endTime,Integer ostate);

	List<Order> selectAllOrder();

	int deleteOrderById(String ono);

}
