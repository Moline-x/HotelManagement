package com.icss.hotel.dao;
/**
 * �������ݿ�
 * @author Moline-x
 *
 */

import org.apache.ibatis.annotations.Param;

import com.icss.hotel.pojo.Emp;

public interface EmpDao {
	
	Emp login(@Param("account")String account,@Param("password")String password);

}
