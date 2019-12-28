package com.icss.hotel.service;

import java.util.List;

import com.icss.hotel.pojo.Customer;
/**
 * ¹Ë¿ÍÐÅÏ¢service²ã
 * @author Moline-x
 *
 */
public interface CustomerService {

	List<Customer> selectAllCustomer();

	int addCustomer(Customer c);

}
