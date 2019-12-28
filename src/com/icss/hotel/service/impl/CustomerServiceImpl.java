package com.icss.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icss.hotel.dao.CustomerDao;
import com.icss.hotel.pojo.Customer;
import com.icss.hotel.service.CustomerService;
/**
 * 顾客信息Service实现类
 * @author Moline-x
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao dao;
	@Override
	public List<Customer> selectAllCustomer() {
		List<Customer> list = dao.selectAllCustomer();
		return list;
	}

	@Override
	public int addCustomer(Customer c) {
		
		return dao.addCustomer(c);
	}

}
