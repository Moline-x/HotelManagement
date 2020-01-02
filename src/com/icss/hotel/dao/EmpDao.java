package com.icss.hotel.dao;
/**
 * ²Ù×÷Êý¾Ý¿â
 * @author Moline-x
 *
 */

import org.apache.ibatis.annotations.Param;

import com.icss.hotel.pojo.Emp;
import java.util.List;

public interface EmpDao {
	
	Emp login(@Param("account")String account,@Param("password")String password);
	
	List<Emp> selectAllEmp();

	int addEmp(Emp e);

	Emp selectByEmpno(@Param("empno")Integer empno);

	int updateEmpById(Emp e);
	
	int updateEmpPassword(Emp e);
	
	
}
