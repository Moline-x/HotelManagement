package com.icss.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.hotel.pojo.Order;
import com.icss.hotel.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService service;
	
	//查看所有订单信息
	@RequestMapping("/selectAllOrder")
	@ResponseBody
	public Object selectAllOrder() {
		List<Order> list = service.selectAllOrder();
		System.out.println("订单:"+list);
		return list;
	}
	
	//添加订单
	@RequestMapping("/addOrder")
	@ResponseBody
	public Object addOrder(Order o) {
		int i = service.addOrder(o);
		if(i > 0) {
			return "success";
		}else {
			return "false";
		}
	}

}
