package com.icss.hotel.service;

import java.util.List;

import com.icss.hotel.pojo.Customer;
/**
 * �˿���Ϣservice��
 * @author Moline-x
 *
 */
public interface CustomerService {

	List<Customer> selectAllCustomer();

	int addCustomer(Customer c);

}
