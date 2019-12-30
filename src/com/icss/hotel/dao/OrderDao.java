package com.icss.hotel.dao;

import java.util.List;

import com.icss.hotel.pojo.Order;

public interface OrderDao {

	int addOrder(Order o);

	List<Order> selectAllOrder();

}
