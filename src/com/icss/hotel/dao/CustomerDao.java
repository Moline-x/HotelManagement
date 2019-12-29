package com.icss.hotel.dao;

import java.util.List;

import com.icss.hotel.pojo.Customer;

public interface CustomerDao {

	List<Customer> selectAllCustomer();

	int addCustomer(Customer c);

}
