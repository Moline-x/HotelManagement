package com.icss.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icss.hotel.pojo.Customer;
import com.icss.hotel.service.CustomerService;

/**
 * ����ת��
 * @author Moline-x
 *
 */
@Controller
public class CustomerController {
	@Autowired
	CustomerService service;
	
	//��ѯ���й˿���Ϣ
	@RequestMapping("/selectAllCustomer")
	@ResponseBody
	public Object selectAllCustomer() {
		List<Customer> list = service.selectAllCustomer();
		return list;
	}
	
	//���ӹ˿���Ϣ
	@RequestMapping("/addCustomer")
	@ResponseBody
	public Object addCustomer(Customer c) {
		int i = service.addCustomer(c);
		if(i > 0) {
			return "success";
		}else {
			return "fail";
		}
	}
}
