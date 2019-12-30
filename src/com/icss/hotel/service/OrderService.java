package com.icss.hotel.service;

import java.util.List;

import com.icss.hotel.pojo.Order;

public interface OrderService {

	int addOrder(Order o);

	List<Order> selectAllOrder();

}
