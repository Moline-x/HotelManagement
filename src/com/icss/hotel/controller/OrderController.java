package com.icss.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.hotel.pojo.Customer;
import com.icss.hotel.pojo.Order;
import com.icss.hotel.service.CustomerService;
import com.icss.hotel.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService service;
	@Autowired
	CustomerService cservice;
	
	//�鿴���ж�����Ϣ
	@RequestMapping("/selectAllOrder")
	@ResponseBody
	public Object selectAllOrder() {
		List<Order> list = service.selectAllOrder();
		System.out.println("����:"+list);
		return list;
	}
	
	//��Ӷ���
	@RequestMapping("/addOrder")
	@ResponseBody
	public Object addOrder(String cname,String cgender,String cidcard,String cphone,Integer tno,Integer rno,String startTime,String endTime,Integer ostate) {
		Customer c = new Customer(cname,cgender,cidcard,cphone);
		c.setIntegral(0);
		if(c != null)
		cservice.addCustomer(c);
		int i = service.addOrder(cidcard,tno,rno,startTime,endTime,ostate);
		if(i > 0) {
			return "success";
		}else {
			return "false";
		}
	}
	
	//ɾ���ͷ�
		@RequestMapping("/deleteOrderById")
		@ResponseBody
		public Object deleteOrderById(String ono) {
			int i = service.deleteOrderById(ono);
			if(i > 0) {
				return "success";
			}else {
				return "fail";
			}
		}

}
